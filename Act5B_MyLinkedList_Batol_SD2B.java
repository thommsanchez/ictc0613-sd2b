package act5b_mylinkedlist_batol_sd2b;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Act5B_MyLinkedList_Batol_SD2B {
    
    //hold an arbitrary integer
    public String fname, mname, lname, acode, telenum, gender; 
    public int age;
    
    public Act5B_MyLinkedList_Batol_SD2B next; //reference to the next node
    public static Act5B_MyLinkedList_Batol_SD2B firstNode; //a reference to the first Node
    public static Act5B_MyLinkedList_Batol_SD2B lastNode = null; //a reference to the last node
    
    public Act5B_MyLinkedList_Batol_SD2B(String[] member, Act5B_MyLinkedList_Batol_SD2B nextloc) {
        fname = member [0];
        mname = member [1];
        lname = member [2];
        acode = member [3];
        telenum = member [4];
        gender = member [5];
        age = Integer.parseInt(member[6]);
        
        next = nextloc;
    }
    
    public static void main(String[] args) throws IOException {
        int numnodes, num;
        String[] member = new String[7];
        
        Scanner reader = new Scanner(System.in);
        System.out.print("How many nodes do you want to input?: ");
        numnodes = reader.nextInt();
        reader.nextLine();
        System.out.println();
        
        for(int i=0; i<numnodes; i++) {
            System.out.println("Kindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            member[0] = reader.nextLine();
            System.out.print("Enter middle name: ");
            member[1] = reader.nextLine();
            System.out.print("Enter last name: ");
            member[2] = reader.nextLine();
            System.out.print("Enter area code: ");
            member[3] = reader.nextLine();
            System.out.print("Enter telephone number: ");
            member[4] = reader.nextLine();
            System.out.print("Enter gender: ");
            member[5] = reader.nextLine();
            System.out.print("Enter age: ");
            member[6] = reader.nextLine();
            System.out.println();

            Act5B_MyLinkedList_Batol_SD2B n = new Act5B_MyLinkedList_Batol_SD2B(member, null); //create node
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
        }
        
        Act5B_MyLinkedList_Batol_SD2B n = firstNode;
        while(n != null) { //loops forward displaying
            System.out.println();
            System.out.println("Welcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
            System.out.println("Your area code and telephone number is (" + n.acode + ")" +(" ") + n.telenum + ("."));
            System.out.println("You are a " + n.gender + " member and your age is " + n.age + ".");
            n=n.next; //move to the next node in the list
        }
        reader.close();
    }
}
