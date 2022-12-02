package act5b_mylinkedlist_carpio_sd2b;

import java.io.IOException;
import java.util.*;

 public class Act5B_MyLinkedList_Carpio_SD2B {
    public Act5B_MyLinkedList_Carpio_SD2B next; //pointer to the next node
    public static Act5B_MyLinkedList_Carpio_SD2B firstnode, lastnode = null; // pointer to the first and last node;
    public String fName, mName, lName, areaCode, telno, gender;
    public int age;
      
    public Act5B_MyLinkedList_Carpio_SD2B (String[] info, Act5B_MyLinkedList_Carpio_SD2B next ) { // storing info of members
     
        fName = info[0];
        mName = info[1];
        lName = info [2];
        areaCode = info [3];
        telno = info [4];
        gender = info [5];
        age = Integer.parseInt(info[6]);
        this.next = next;      
 }  
    public static void main(String[] args) throws IOException  {      
        String info [] =  new String[7];
        int input;
        
        Scanner ui = new Scanner (System.in);
        
        System.out.print("How many members’ information will be entered? ");
        input = ui.nextInt();
        
        for (int i = 1; i <= input; i++ ){
            System.out.println("\nKindly give the information of member #" + i);
            System.out.print("Enter first name: ");
            info[0] = ui.next();
            System.out.print("Enter middle name: ");
            info[1] = ui.next();
            System.out.print("Enter last name: ");
            info[2] = ui.next();
            System.out.print("Enter area code: ");
            info[3] = ui.next();
            System.out.print("Enter telephone number: ");
            info[4] = ui.next();
            System.out.print("Enter gender: ");
            info [5] = ui.next();
            System.out.print("Enter age: ");
            info[6] = ui.next();         
        
       Act5B_MyLinkedList_Carpio_SD2B n = new Act5B_MyLinkedList_Carpio_SD2B (info, null); // create node
        
            if (lastnode != null){ //if it is not the first node
                lastnode.next = n;
                lastnode = n;               
            }
            else { //if n is the first node
                firstnode = n;
                lastnode = n;
            }
    }    
        Act5B_MyLinkedList_Carpio_SD2B next = firstnode;
        while (next != null){           
            System.out.println("\nWelcome to the club  " + next.fName + " " + next.mName+ " " + next.lName + "!");
            System.out.println("Your area code and telephone number is " + "(" + next.areaCode + ") " + next.telno + ".");
            System.out.println("You are a " + next.gender + " and your age is " + next.age +  ".");           
            next = next.next;           
        }  
    }   
}