import java.io.IOException;
import java.util.Scanner;

public class Act5B_MyLinkedList_Cubebe_SD2B
{
    public Act5B_MyLinkedList_Cubebe_SD2B next; 
    public static Act5B_MyLinkedList_Cubebe_SD2B firstNode;
    public static Act5B_MyLinkedList_Cubebe_SD2B lastNode = null;
    
    public String fName, mName, lName, areaCode, telNo, gender;
    public int age;

        public Act5B_MyLinkedList_Cubebe_SD2B(String[] info, Act5B_MyLinkedList_Cubebe_SD2B nextL)
        {
            fName = info[0];
            mName = info[1];
            lName = info[2];
            areaCode = info[3];
            telNo = info[4];
            gender = info[5];
            age = Integer.parseInt(info[6]);

            next = nextL;
        }

    public static void main(String[] args) throws IOException 
    {
            String[] info = new String[7];
            int numNodes;

            Scanner scan = new Scanner(System.in);

            System.out.print("How many members' information will be entered? ");
            numNodes = scan.nextInt();
            scan.nextLine();
            System.out.print("\n");

                for(int i = 0; i < numNodes; i++) 
                {
                    System.out.println("Kindly give the information of member #" + (i+1));  
                    System.out.print("Enter first name: ");
                    info[0] = scan.nextLine();
                    System.out.print("Enter middle name: ");
                    info[1] = scan.nextLine();
                    System.out.print("Enter last name: ");
                    info[2] = scan.nextLine();
                    System.out.print("Enter area code: ");
                    info[3] = scan.nextLine();
                    System.out.print("Enter telephone number: ");
                    info[4]= scan.nextLine();
                    System.out.print("Enter gender: ");
                    info[5] = scan.nextLine();
                    System.out.print("Enter age: ");
                    info[6] = scan.nextLine();
                    System.out.println();

                    Act5B_MyLinkedList_Cubebe_SD2B n = new Act5B_MyLinkedList_Cubebe_SD2B (info, null);
                    if(lastNode != null)
                    {
                        lastNode.next = n;
                        lastNode = n;
                    }
                    else
                    {
                        firstNode = n;
                        lastNode = n;
                    }
                }
                
                Act5B_MyLinkedList_Cubebe_SD2B n = firstNode;
                while(n != null)
                {
                    System.out.print("Welcome to the club ");
                    System.out.println(n.fName + " " + n.mName + " " + n.lName + "!");
                    System.out.print("Your area code and telephone number is ");
                    System.out.println("(" + n.areaCode + ")" + n.telNo + ".");
                    System.out.print("You are a " + n.gender + " member ");
                    System.out.println("and your age is " + n.age + ".");
                    System.out.print("\n");
                    n=n.next;
                }
                scan.close();
    }
}