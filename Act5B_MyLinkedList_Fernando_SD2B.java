import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_Fernando_SD2B {
    
    public Act5B_MyLinkedList_Fernando_SD2B next; //reference to the next node
    public static Act5B_MyLinkedList_Fernando_SD2B firstNode; //a reference to the first Node
    public static Act5B_MyLinkedList_Fernando_SD2B lastNode = null; //a reference to the last node
    public String firstName, middleName, lastName, areaCode, telephoneNumber, gender;
    public int age;

    public Act5B_MyLinkedList_Fernando_SD2B(String[] memberData, Act5B_MyLinkedList_Fernando_SD2B nextLoc) {

        // Assigning names for every data in index for easier access
        firstName = memberData[0];
        middleName = memberData[1];
        lastName = memberData[2];
        areaCode = memberData[3];
        telephoneNumber = memberData[4];
        gender = memberData[5];
        age = Integer.parseInt(memberData[6]);

        next = nextLoc;
    }
    
    public static void main(String[] args) throws IOException {

        int numnodes;
        String[] memberData = new String[7]; //hold members data (different contents per node)
        Scanner sc = new Scanner(System.in);

        System.out.print("How many members' information will be entered?: ");
        numnodes = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for(int i = 0; i < numnodes; i++) {

            System.out.println("Kindly give the information of member #" + (i+1));  
            System.out.print("Enter first name: ");
            memberData[0] = sc.nextLine();
            System.out.print("Enter middle name: ");
            memberData[1] = sc.nextLine();
            System.out.print("Enter last name: ");
            memberData[2] = sc.nextLine();
            System.out.print("Enter area code: ");
            memberData[3] = sc.nextLine();
            System.out.print("Enter telephone number: ");
            memberData[4]= sc.nextLine();
            System.out.print("Enter gender: ");
            memberData[5] = sc.nextLine();
            System.out.print("Enter age: ");
            memberData[6] = sc.nextLine();
            System.out.println();
                   
            Act5B_MyLinkedList_Fernando_SD2B node = new Act5B_MyLinkedList_Fernando_SD2B(memberData, null); //create node

            if(lastNode != null){ //if it is not the first node
                lastNode.next = node;
                lastNode = node;

            }else{ //if n is the first node
                firstNode = node;
                lastNode = node;

            }
        }
        
        Act5B_MyLinkedList_Fernando_SD2B n = firstNode;
        while(n != null){

            System.out.printf("Welcome to the club %s %s %s!%n", n.firstName, n.middleName, n.lastName);
            System.out.printf("Your area code and telephone number is (%s) %s.%n", n.areaCode, n.telephoneNumber);
            System.out.printf("You are a %s member and your age is %s.%n%n", n.gender, n.age);

            n=n.next;
        }
        sc.close();
    }
}

