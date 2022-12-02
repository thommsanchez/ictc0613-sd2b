package Act5B_MyLinkedList_Reyes_SD2B;
import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_Reyes_SD2B {

    public Act5B_MyLinkedList_Reyes_SD2B next; //reference to the next node
    public static Act5B_MyLinkedList_Reyes_SD2B firstNode; //a reference to the first Node
    public static Act5B_MyLinkedList_Reyes_SD2B lastNode = null; //a reference to the last node
    
    public String firstname, middlename, lastname, areacode, telephoneno, gender;
    public int age;
    
    public Act5B_MyLinkedList_Reyes_SD2B(String[] information, Act5B_MyLinkedList_Reyes_SD2B n) {
        firstname = information[0];
        middlename = information[1];
        lastname = information[2];
        areacode = information[3];
        telephoneno = information[4];
        gender = information[5];
        age = Integer.parseInt(information[6]);
        next = n;
    }
    
    public static void main(String[] args) throws IOException {
        String[] information = new String[7];
        int numnodes;
        Scanner reader = new Scanner(System.in);
        System.out.print("How many members' information will be entered? ");
        numnodes = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        
        for(int i=0; i<numnodes; i++) {
            System.out.println("Kindly give the information of number #" + (i+1));
            
            System.out.print("Enter first name: ");
            information[0] = reader.nextLine();
            
            System.out.print("Enter middle name: ");
            information[1] = reader.nextLine();
            
            System.out.print("Enter last name: ");
            information[2] = reader.nextLine();
            
            System.out.print("Enter areacode: ");
            information[3] = reader.nextLine();
            
            System.out.print("Enter telephone number: ");
            information[4] = reader.nextLine();
            
            System.out.print("Enter gender: ");
            information[5] = reader.nextLine();
            
            System.out.print("Enter age: ");
            information[6] = reader.nextLine();
            
            Act5B_MyLinkedList_Reyes_SD2B n = new  Act5B_MyLinkedList_Reyes_SD2B(information, null); //create node
            
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } 
            else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
            System.out.println("");
        }
        
        Act5B_MyLinkedList_Reyes_SD2B n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.println("Welcome to the club " +  n.firstname + " " + n.middlename + " " + n.lastname + "!");
            System.out.println("Your area code and telephone number is " + "(" + n.areacode + ")" + " " + n.telephoneno + ".");
            System.out.println("You are a " + n.gender + " member and your age is " + n.age + ".");
            
            System.out.println("");
                       
            n = n.next; //move to the next node in the list
        }
        reader.close();
    }
}