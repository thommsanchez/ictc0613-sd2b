/*
    BANZON, JHAZTINE MIKHAELA B.
    BSCS-SD2B
*/
package Act05b;
import java.io.IOException;
import java.util.*;

public class Act5_MyLinkedList_Banzon_SD2B
{
    public static Scanner scan = new Scanner(System.in); 
    public String fName, mName, lName, telNo, gender;
    public int age, arCode;
    public static int memNo, i;    
    public Act5_MyLinkedList_Banzon_SD2B next; //reference to the next node
    public static Act5_MyLinkedList_Banzon_SD2B fNode, lNode = null; //reference to the first node, last node
    public static final String[] memberInfo = new String[7]; //create array
    
    public static void main(String[] args) throws IOException
    {   
        System.out.println("\t✧*:･ﾟ SCIENCE CLUB MEMBER INFO REGISTRATION *:･ﾟ✧");
        System.out.print("\nHow many members' information will be entered? ");
        memNo = scan.nextInt();
        scan.nextLine();
        
        for(i=0; i<memNo; i++)
        {
            getInfo();//get user input for member info
            
            Act5_MyLinkedList_Banzon_SD2B n = new Act5_MyLinkedList_Banzon_SD2B(memberInfo, null); //create node
            
            if(lNode != null) //if n is not the first node
            {
                lNode.next = n;
                lNode = n;
            }
            else  //if n is the first node
            {
                fNode = n;
                lNode = n;
            }
        }
        Act5_MyLinkedList_Banzon_SD2B n = fNode;
        System.out.println("\n\t*✧:･ﾟThere are " + memNo + " new Science Club member/s! w(°ｏ°)w");
        
        while(n != null)
        {
            System.out.print("\nWelcome to the club " + n.fName + " " + n.mName + " " + n.lName + "!(｡•̀ᴗ-)✧\n");
            System.out.println("Your area code and telephone number is " + "(" + n.arCode + ")" + n.telNo + ".");
            System.out.println("You are a " + n.gender + " and your age is " + n.age + ".");
            n = n.next;  
        }
        System.out.println("\n\t ✿✿✿✿✿✿✿✿✿ヾ(*´・∀・)ﾉヾ(・∀・`*)ﾉ✿✿✿✿✿✿✿✿✿");
        System.out.println("\t\t We are very happy to welcome everyone!");
        System.out.println("\t\t We hope we will be able to present you ");
        System.out.println("\t\t with various lovely days and memories.");
        System.out.println("\t✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿\n");
        scan.close();
    }
    public Act5_MyLinkedList_Banzon_SD2B(String[] memberInfo, Act5_MyLinkedList_Banzon_SD2B nextAd)
    {
        fName = memberInfo[0];
        mName = memberInfo[1];
        lName = memberInfo[2];
        arCode = Integer.parseInt(memberInfo[3]);
        telNo = memberInfo[4];
        gender = memberInfo[5];
        age = Integer.parseInt(memberInfo[6]);
        next = nextAd;
    }
    public static void getInfo()
    {
            System.out.println("\n\tKindly give the information of member #" + (i+1));
            System.out.print("\nEnter first name: ");
            memberInfo[0] = scan.nextLine();
            System.out.print("Enter middle name: ");
            memberInfo[1] = scan.nextLine();
            System.out.print("Enter last name: ");
            memberInfo[2] = scan.nextLine();
            System.out.print("Enter area code: ");
            memberInfo[3] = scan.nextLine();
            System.out.print("Enter telephone number: ");
            memberInfo[4] = scan.nextLine();
            System.out.print("Enter gender: ");
            memberInfo[5] = scan.nextLine();
            System.out.print("Enter age: ");
            memberInfo[6] = scan.nextLine();        
    }
}


