import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_Agulto_SD2B
{
    public Act5B_MyLinkedList_Agulto_SD2B  next; 
    public static Act5B_MyLinkedList_Agulto_SD2B firstNode;
    public static Act5B_MyLinkedList_Agulto_SD2B lastNode = null;

    public String fName, mName, lName, areaCode, telNo, gender;
    public int age;
    
    public Act5B_MyLinkedList_Agulto_SD2B (String[] memInfo, Act5B_MyLinkedList_Agulto_SD2B  n) 
    {
        fName = memInfo[0];
        mName = memInfo[1];
        lName = memInfo[2];
        areaCode = memInfo[3];
        telNo = memInfo[4];
        gender = memInfo[5];
        age = Integer.parseInt(memInfo[6]);
        next = n;
    }

    public static void main(String[] args) throws IOException
    {
        String[] memInfo = new String[7];
        int numNodes;

        Scanner scan = new Scanner(System.in);
        System.out.print("How many members' information will be entered? ");
        numNodes = Integer.parseInt(scan.nextLine());
        System.out.print("\n");
        

        for(int i = 0; i < numNodes; i++)
        {

            System.out.println("Kindly give the information of member #" + (i + 1));

            System.out.print("Enter first name: ");
            memInfo[0] = scan.nextLine();

            System.out.print("Enter middle name: ");
            memInfo[1] = scan.nextLine();
            
            System.out.print("Enter last name: ");
            memInfo[2] = scan.nextLine();

            System.out.print("Enter area code: ");
            memInfo[3] = scan.nextLine();

            System.out.print("Enter telephone number: ");
            memInfo[4]= scan.nextLine();

            System.out.print("Enter gender: ");
            memInfo[5] = scan.nextLine();

            System.out.print("Enter age: ");
            memInfo[6] = scan.nextLine();

            System.out.println();

            Act5B_MyLinkedList_Agulto_SD2B  n = new Act5B_MyLinkedList_Agulto_SD2B(memInfo, null);

            if(lastNode != null)
            {
                lastNode.next = n;
                lastNode = n;
            } 

            else
            {
                firstNode = n;
                lastNode = n;
           
            }
        }

        Act5B_MyLinkedList_Agulto_SD2B  n = firstNode;
        while(n != null) 
        {
            System.out.print("\n");
            System.out.printf("\n Welcome to the club %s %s %s!", n.fName, n.mName, n.lName);
            System.out.printf("\n Your area code and telephone number are (%s) %s.", n.areaCode, n.telNo);
            System.out.printf("\n You are a %s member, and your age is %s.", n.gender, n.age);

            n = n.next;
        }
        scan.close();
    }
}