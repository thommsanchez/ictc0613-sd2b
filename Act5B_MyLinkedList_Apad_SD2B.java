import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_Apad_SD2B {

    public Act5B_MyLinkedList_Apad_SD2B(String [] list, Act5B_MyLinkedList_Apad_SD2B nd) {
        
        fName = list[0];
        mName = list[1];
        lName = list[2];
        areaCode = list[3];
        tpNumber = list[4];
        gender = list[5];
        age = Integer.parseInt(list[6]);
        
        next = nd;
    }
    
    //Main method
    public static void main(String[] args) throws IOException {
        int numnodes;
        String[] list = new String[7];
        Scanner rd = new Scanner(System.in);
        
        System.out.print("How many members' information will be entered?: ");
        numnodes = rd.nextInt();
        rd.nextLine();
        System.out.print("");
        
        int i=0;
        while(i<numnodes) {
     
            System.out.println("Kindly give the information of member #" + (i+1));  
            System.out.print("Enter first name: ");
            list[0] = rd.nextLine();
            System.out.print("Enter middle name: ");
            list[1] =rd.nextLine();
            System.out.print("Enter last name: ");
            list[2] = rd.nextLine();
            System.out.print("Enter area code: ");
            list[3] = rd.nextLine();
            System.out.print("Enter telephone number: ");
            list[4]= rd.nextLine();
            System.out.print("Enter gender: ");
            list[5] = rd.nextLine();
            System.out.print("Enter age: ");
            list[6] = rd.nextLine();
            System.out.println();
            
            
            Act5B_MyLinkedList_Apad_SD2B nd = new Act5B_MyLinkedList_Apad_SD2B(list, null); //create node
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = nd;
                lastNode = nd;
            } else { //if nd is the first node
                firstNode = nd;
                lastNode = nd;
            }
            i++;
        }
        
        Act5B_MyLinkedList_Apad_SD2B node = firstNode;
        while (node != null){

            System.out.printf("Welcome to the club %s %s %s!%n", node.fName, node.mName, node.lName);
            System.out.printf("Your area code and telephone number is (%s) %s.%n", node.areaCode, node.tpNumber);
            System.out.printf("You are a %s member and your age is %s.%n%n", node.gender, node.age);

            node=node.next;
        }
        rd.close();
        
    }
public Act5B_MyLinkedList_Apad_SD2B next; 
public static Act5B_MyLinkedList_Apad_SD2B firstNode; 
public static Act5B_MyLinkedList_Apad_SD2B lastNode = null; 
public String fName, mName, lName, areaCode, tpNumber, gender;
public int age; 
}
