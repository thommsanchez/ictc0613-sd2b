import java.io.IOException;
import java.util.Scanner;

    public class Act5B_MyLinkedList_Vargas_SD2B {
    public String fname;
    public String mname; 
    public String lname; 
    public String areacode; 
    public String telnum; 
    public String gender; 
    public int age; 
    
    public Act5B_MyLinkedList_Vargas_SD2B next; 
    public static Act5B_MyLinkedList_Vargas_SD2B firstNode;
    public static Act5B_MyLinkedList_Vargas_SD2B lastNode = null;
    
    public Act5B_MyLinkedList_Vargas_SD2B(String firstname, String middlename, String lastname, String acode, String teln, String gen, int g, Act5B_MyLinkedList_Vargas_SD2B n) {
        
        fname = firstname;
        mname = middlename;
        lname = lastname;
        areacode = acode;
        telnum = teln;
        gender = gen;
        age = g;
        next = n;
    }
    
    public static void main(String[] args) throws IOException {
        int numnodes, g;
        String firstname, middlename, lastname, acode, teln, gen;
        Scanner reader = new Scanner(System.in);
        System.out.print("How many nodes do you want to input?: ");
        numnodes = reader.nextInt();
        reader.nextLine();
        
        for(int i=0; i<numnodes; i++) {
            System.out.println("Enter node #" + (i+1));
            
            System.out.print("Enter first name: ");
            firstname = reader.nextLine();
            System.out.print("Enter middle name: ");
            middlename = reader.nextLine();
            System.out.print("Enter last name: ");
            lastname = reader.nextLine();
            System.out.print("Enter area code: ");
            acode = reader.nextLine();
            System.out.print("Enter telephone number: ");
            teln = reader.nextLine();
            System.out.print("Enter gender: ");
            gen = reader.nextLine();
            System.out.print("Enter age: ");
            g = reader.nextInt();
            reader.nextLine();
            
            System.out.println("");
            
            Act5B_MyLinkedList_Vargas_SD2B n = new Act5B_MyLinkedList_Vargas_SD2B(firstname, middlename, lastname, acode, teln, gen, g, null); 
            if(lastNode != null) 
            {
                lastNode.next = n;
                lastNode = n;
            } else { 
                firstNode = n;
                lastNode = n;
            }
        }
        
        Act5B_MyLinkedList_Vargas_SD2B n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.println("Welcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
            System.out.println("Your area code and telephone number is (" + n.areacode + ") " + n.telnum);
            System.out.println("You are a " + n.gender + " and your age is " + n.age + ".");
            System.out.println("");
            
            n=n.next; //move to the next node in the list
        }
        System.out.println();
    }
}