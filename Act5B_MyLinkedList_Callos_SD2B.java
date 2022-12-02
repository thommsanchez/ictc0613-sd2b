package week5bTry;
import java.io.IOException;
import java.util.*;

public class Act5B_MyLinkedList_Callos_SD2B {
    public static Act5B_MyLinkedList_Callos_SD2B firstNode;
    public static Act5B_MyLinkedList_Callos_SD2B lastNode = null;
    public Act5B_MyLinkedList_Callos_SD2B next;
    public String fname, mname, lname, areaCode, number, gender;
    public int age;
    
    public Act5B_MyLinkedList_Callos_SD2B(String[] data,Act5B_MyLinkedList_Callos_SD2B n){
      fname = data[0];
      mname = data[1];
      lname = data[2];
      areaCode = data[3];
      number = data[4];
      gender = data[5];
      age = Integer.parseInt(data[6]);
      next = n;
    }   
//outpute   
    public static void main(String[] args) throws IOException{    
        int nodes;
        Scanner ui = new Scanner(System.in);
        String[] data = new String[7];
        
        System.out.print("How many member's information will be entered?: ");
        nodes = ui.nextInt();
        ui.nextLine();
        
            for(int i = 0; i < nodes; i++){
                System.out.println("Kindly give the information of member #" + (i+1));  
                System.out.print("Enter first name: ");
                data[0] = ui.nextLine();
                System.out.print("Enter middle name: ");
                data[1] = ui.nextLine();
                System.out.print("Enter last name: ");
                data[2] = ui.nextLine();
                System.out.print("Enter area code: ");
                data[3] = ui.nextLine();
                System.out.print("Enter telephone number: ");
                data[4]= ui.nextLine();
                System.out.print("Enter gender: ");
                data[5] = ui.nextLine();
                System.out.print("Enter age: ");
                data[6] = ui.nextLine();
                System.out.println();
            
                Act5B_MyLinkedList_Callos_SD2B n = new Act5B_MyLinkedList_Callos_SD2B (data, null);
                if(lastNode !=null){
                lastNode.next = n;
                lastNode = n;
                }
                else {
                firstNode = n;
                lastNode = n;
                }
            }   
     
            Act5B_MyLinkedList_Callos_SD2B n = firstNode;            
            while(n != null){
                System.out.println("Welcome to the club " + n.fname + " " + n.mname + " " + n.lname + "!");
                System.out.println("Your area code and telephone number is (" + n.areaCode + ")" + n.number + ".");
                System.out.println("You are a " + n.gender + " member and your age is " + n.age + ".");
                n = n.next;
            }
    }
}

