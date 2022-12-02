import java.io.IOException;
import java.util.Scanner;

 public class Act5_MyLinkedList_Bohlen_SD2B 
{
    public Act5_MyLinkedList_Bohlen_SD2B next;
    public static Act5_MyLinkedList_Bohlen_SD2B firstnode; 
    public static Act5_MyLinkedList_Bohlen_SD2B lastnode = null;
    public String fname, mname, lname, acode, telnum, gender;
    public int age;
      
public Act5_MyLinkedList_Bohlen_SD2B (String[] meminfo, Act5_MyLinkedList_Bohlen_SD2B next )
{   
    fname = meminfo[0];
    mname = meminfo[1];
    lname = meminfo [2];
    acode = meminfo [3];
    telnum = meminfo [4];
    gender = meminfo [5];
    age = Integer.parseInt(meminfo[6]);  
 }  

    public static void main(String[] args) throws IOException  
    {  
        int nodes;   
        String meminfo [] =  new String[7];
        Scanner scan = new Scanner (System.in);
       
        System.out.print(" ");
        System.out.print("How many members’ information will be entered? ");
        nodes = scan.nextInt();
        
        for (int i = 0; i < nodes; i++ )
        {
            System.out.println("Kindly give the information of member #" + (i+1));

            System.out.print("Enter first name: ");
            meminfo[0] = scan.next();

            System.out.print("Enter middle name: ");
            meminfo[1] = scan.next();

            System.out.print("Enter last name: ");
            meminfo[2] = scan.next();

            System.out.print("Enter area code: ");
            meminfo[3] = scan.next();

            System.out.print("Enter telephone number: ");
            meminfo[4] = scan.next();

            System.out.print("Enter gender: ");
            meminfo [5] = scan.next();

            System.out.print("Enter age: ");
            meminfo[6] = scan.next(); 

            System.out.println(" ");    
        

            Act5_MyLinkedList_Bohlen_SD2B n = new Act5_MyLinkedList_Bohlen_SD2B (meminfo, null);
            if (lastnode != null)
            {
                lastnode.next = n;
                lastnode = n;               
            }
            else 
            { 
                firstnode = n;
                lastnode = n;
            }
        }    

        Act5_MyLinkedList_Bohlen_SD2B next = firstnode;
        while (next != null)
        {           
            System.out.println("Welcome to the club " + next.fname + " " + next.mname+ " " + next.lname + "!");
            System.out.println("Your area code and telephone number is" + " (" + next.acode + ") " + next.telnum + ".");
            System.out.println("You are a " + next.gender + " and your age is " + next.age +  ".");           
            next = next.next;           
        }  
    }   
}