package act5b_mylinkedlist_canonizado_sd2b;
import java.io.IOException;
import java.util.Scanner;
public class Act5B_MyLinkedList_Canonizado_SD2B
{
    public int data;
    public Act5B_MyLinkedList_Canonizado_SD2B  next; 
    public static Act5B_MyLinkedList_Canonizado_SD2B topnode;
    public static Act5B_MyLinkedList_Canonizado_SD2B bottomnode = null;
    public String firstname, middlename, lastname, areacode, telephonenumber, gender;
    public int age;
    private String fname;
    private String mname;
    private String lname;
    private String telno;
    private String sex;
    
    public Act5B_MyLinkedList_Canonizado_SD2B (String[] data, Act5B_MyLinkedList_Canonizado_SD2B  next) 
    {
        firstname = data[0];
        middlename = data[1];
        lastname = data[2];
        areacode = data[3];
        telephonenumber = data[4];
        gender = data[5];
        age = Integer.parseInt(data[6]);
        
        Act5B_MyLinkedList_Canonizado_SD2B n = null;
        next = n;
    }

    public static void main(String[] args) throws IOException
    {
        String[] memInfo = new String[7];
        int numbers;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("How many members' information will be entered? ");
            numbers = Integer.parseInt(scan.nextLine());
                        
            for(int i = 0; i < numbers; i++)
            {
                
                System.out.println("\nKindly give the information of member #" + (i + 1));               
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
                
                Act5B_MyLinkedList_Canonizado_SD2B  next = new Act5B_MyLinkedList_Canonizado_SD2B(memInfo, null);
                if( bottomnode != null)
                {
                    bottomnode.next = next;
                    bottomnode = next;
                }     
                else
                {
                    topnode = next;
                    bottomnode = next;                   
                }
            }
            
            Act5B_MyLinkedList_Canonizado_SD2B  next = topnode;
             while (next != null){           
                System.out.println("\nWelcome to the club  " + next.firstname + " " + next.middlename+ " " + next.lastname + "!");
                System.out.println("Your area code and telephone number is " + "(" + next.areacode + ") " + next.telephonenumber + ".");
                System.out.println("You are a " + next.gender + " and your age is " + next.age +  ".");           
                next = next.next;   
             }
         }
    }
}