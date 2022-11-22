import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_DeGuzmanCJ_SD2B {
    public static void main(String[] args) throws IOException {
        String[] data = new String[7];
        int numNodes;
        System.out.print("How many members' information will be entered? ");
        numNodes = Integer.parseInt(scan.nextLine());
        System.out.print("\n");
        for(int i = 0; i < numNodes; i++) {
            System.out.print("\nKindly give the information of member #" + (i+1) + "\n");
            System.out.print("Enter first name: ");
            data[0] = scan.nextLine();
            System.out.print("Enter middle name: ");
            data[1] = scan.nextLine();
            System.out.print("Enter last name: ");
            data[2] = scan.nextLine();
            System.out.print("Enter area code: ");
            data[3] = scan.nextLine();
            System.out.print("Enter telephone number: ");
            data[4]= scan.nextLine();
            System.out.print("Enter gender: ");
            data[5] = scan.nextLine();
            System.out.print("Enter age: ");
            data[6] = scan.nextLine();
            Act5B_MyLinkedList_DeGuzmanCJ_SD2B n = new Act5B_MyLinkedList_DeGuzmanCJ_SD2B(data, null);
            if(lastNode != null) {
                lastNode.next = n;
                lastNode = n;
            } 
            else {
                firstNode = n;
                lastNode = n;
            }
        }
        
        Act5B_MyLinkedList_DeGuzmanCJ_SD2B n = firstNode;
        while(n != null) {
            System.out.print("\n");
            System.out.printf("\nWelcome to the club %s %s %s!", n.firstName, n.middleName, n.lastName);
            System.out.printf("\nYour area code and telephone number are (%s) %s.", n.areaCode, n.telNo);
            System.out.printf("\nYou are a %s member, and your age is %s.", n.gender, n.age);
            n = n.next;
        }
        scan.close();
    }
    public static Scanner scan = new Scanner(System.in);
    public String firstName, middleName, lastName, areaCode, telNo, gender;
    public int age;
    public Act5B_MyLinkedList_DeGuzmanCJ_SD2B next; 
    public static Act5B_MyLinkedList_DeGuzmanCJ_SD2B firstNode, lastNode = null;
    public Act5B_MyLinkedList_DeGuzmanCJ_SD2B(String[] data, Act5B_MyLinkedList_DeGuzmanCJ_SD2B n) {
        firstName = data[0];
        middleName = data[1];
        lastName = data[2];
        areaCode = data[3];
        telNo = data[4];
        gender = data[5];
        age = Integer.parseInt(data[6]);
        next = n;
    }
}
