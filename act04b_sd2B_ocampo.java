import java.util.*;

public class act04b_sd2B_ocampo{

    static int max= 10;
    static Integer array[] = new Integer[max];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int choice;
        do{
            System.out.println("(1) Insert a value \n" 
            + "(2) Delete a value \n"
            + "(3) Traverse array \n"
            + "(4) Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            
            switch(choice){
                case 1:
                    insertItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    traverseArray();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        while(choice != 4);
    }

    static void insertItem(){
        int val;
        if(ifFull())
        {
            System.out.println("The array is full.\n");   
        }
        else
        {
            System.out.print("Enter the value you want to insert: ");
            val = sc.nextInt();
            
            for(int i = 0; i < max; i++){
                if (array[i] == null)
                {
                    array[i] = val;
                    break;
                }
                else
                {
                    continue;
                }
            }
            System.out.println("The value is inserted.\n");
        }
    }

    static void deleteItem(){
        int value;
        if(ifEmpty())
        {
            System.out.println("The array is empty.");
            System.out.println("");
        }
        else
        {
            System.out.print("Enter the number you want to delete: ");
            value = sc.nextInt();
            findLocationDelete(value);
            System.out.println("");
        }
    }

    static void findLocationDelete(int value){
        boolean noVal = false;
        for(int i = 0; i < max; i++){
            if(array[i] != null)
            {
                if(array[i] == value)
                {
                    array[i] = null;
                    printArray(i);
                    System.out.println("The value is deleted.");
                    noVal = false;
                    break;
                }
            }
            else
            {
                noVal = true;
                break;
            }
        }
        if(noVal)
        {
            System.out.println("The value does not exist.");
        }
    }

    static boolean ifFull(){
        if (array [max-1] == null) return false;
        return true;
    }

    static boolean ifEmpty(){
        if (array [0] == null) return true;
        return false;
    }   

    static void traverseArray(){
        if (ifEmpty() == true)
        {
            System.out.println("The Array is Empty.");
            System.out.println("");
        }
        else
        {
            System.out.println(Arrays.toString(array));
        }
    }

    public static void printArray(int print) {
        for(int i = print; i < max - 1; i++) {
            array[i] = array[i + 1];
            array[i+1] = null;
        }
    }
}