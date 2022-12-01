import java.util.*;
public class Act5B_MyLinkedList_Perciano_SD2B {
    public String FirstName, MiddleName, LastName, AreaCode, Number, Gender;
    public int Age;
    public static Act5_MyLinkedList_Perciano_SD2B First_Node;
    public static Act5_MyLinkedList_Perciano_SD2B Last_Node = null;
    public Act5_MyLinkedList_Perciano_SD2B next;
    
    public Act5B_MyLinkedList_Perciano_SD2B(String fname,String mname,String lname,String area_code,String phone_num,String gender,int age,Act5_MyLinkedList_Perciano_SD2B n)
    {
      FirstName = fname;
      MiddleName = mname;
      LastName = lname;
      AreaCode = area_code;
      Number = phone_num;
      Gender = gender;
      Age = age;
      next =  n;
    }
    
    public static void main(String[] args) 
    {
        String first_name, middle_name, last_name, area_code, number, gender;
        int nodes, age;
        Scanner input = new Scanner(System.in);
        System.out.print("How many member's information will be entered?: ");
        nodes = input.nextInt();
        
        for(int i = 0; i < nodes; i++)
        {
            System.out.println("\nKindly give the information of member #" + (i+1));
            System.out.print("Enter first name: ");
            first_name = input.next();
            System.out.print("Enter middle name: ");
            middle_name = input.next();
            System.out.print("Enter last name: ");
            last_name = input.next();
            System.out.print("Enter area code: ");
            area_code = input.next();
            System.out.print("Enter telephone number: ");           
            number = input.next();
            System.out.print("Enter gender: ");
            gender = input.next();
            System.out.print("Enter age: ");
            age = input.nextInt();
            
            Act5_MyLinkedList_Perciano_SD2B n = new Act5_MyLinkedList_Perciano_SD2B (first_name, middle_name, last_name, area_code, number, gender, age, null);
            if(Last_Node !=null)
            {
                Last_Node.next = n;
                Last_Node = n;
            }
            else 
            {
                First_Node = n;
                Last_Node = n;
            }
        }   
     
            Act5_MyLinkedList_Perciano_SD2B n = First_Node;
            
            while(n != null)
            {
                System.out.println("\nWelcome to the club " + n.FirstName + " " + n.MiddleName + " " + n.LastName + "!");
                System.out.println("Your area code and telephone number is (" + n.AreaCode + ")" + n.Number + ".");
                System.out.println("You are a " + n.Gender + " member, and your age is " + n.Age + ".");
                n = n.next;
        }
        
        System.out.println("\nThank you :>");
        System.exit(0);
    }
}