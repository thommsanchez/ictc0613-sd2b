import java.io.IOException;
import java.io.*;

public class Act5B_MyLinkedList_Daproza_SD2B {
    public int data;
    public String FName, MName, LName, Gender, Areacode, Telno; 
    public int age;
    public Act5B_MyLinkedList_Daproza_SD2B next;
    public static Act5B_MyLinkedList_Daproza_SD2B firstNode;
    public static Act5B_MyLinkedList_Daproza_SD2B lastNode = null;

    public Act5B_MyLinkedList_Daproza_SD2B(String[] data, Act5B_MyLinkedList_Daproza_SD2B n){
        FName = data[0];
        MName = data[1];
        LName = data[2];
        Areacode = data[3];
        Telno = data[4];
        Gender = data[5];
        age = Integer.parseInt(data[6]);

        next = n;
    }
    
    
    
    public static void main(String args[]) throws IOException {
        String[] data = new String[7];
        int nodes;
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        System.out.print("How many members information will be entered? ");
        nodes = Integer.parseInt(reader.readLine());
        for(int i = 0; i < nodes; i++) {
            System.out.println("Kindly give the information of member #" + (i + 1));
            System.out.print("Enter first name: ");
            data[0] = reader.readLine();
            System.out.print("Enter middle name: ");
            data[1] = reader.readLine();
            System.out.print("Enter last name: ");
            data[2] = reader.readLine();
            System.out.print("Enter area code: ");
            data[3] = reader.readLine();
            System.out.print("Enter telephone number: ");
            data[4] = reader.readLine();
            System.out.print("Enter gender: ");
            data[5] = reader.readLine();
            System.out.print("Enter age: ");
            data[6] = reader.readLine();


            Act5B_MyLinkedList_Daproza_SD2B n = new Act5B_MyLinkedList_Daproza_SD2B(data, null); //create node
            if(lastNode != null) //if it is not the first node
            {
                lastNode.next = n;
                lastNode = n;
            } else { //if n is the first node
                firstNode = n;
                lastNode = n;
            }
        }
        
        Act5B_MyLinkedList_Daproza_SD2B n = firstNode;
        do{ //loops forward displaying
            System.out.println();
            System.out.printf("\nWelcome to the club %s %s %s!", n.FName, n.MName, n.LName);
            System.out.printf("\nYour area code and telephone number is (%s) %s.", n.Areacode, n.Telno);
            System.out.printf("\nYou are a %s member and your age is %s.", n.Gender, n.age);

            n = n.next; //move to the next node in the list
        } while(n != null);

        reader.close();
    } 
}
    
    