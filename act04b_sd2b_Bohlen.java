import java.util.Scanner;

public class act04b_sd2b_Bohlen{

    public static void main(String[] args) {

        String choice;
        System.out.println("Good Day User!!!");

        do{
            OP();
            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[4] Exit");
            System.out.print("Choice: ");
            choice = scan.nextLine();
            System.out.println();

    switch(choice){
        case "1":
                if(full()==false){
            EnterItem();
            }
                else{
            System.out.println("Your ARRAY is full, Remove some Item");
            }
                break;

        case "2":
            if(empty()==false){
            Delete();
            }
            else{
            System.out.println("Your ARRAY is empty, Add some Item");
            }
            break;

        case "3":
            if(empty()==false){
            traverse();
            }
            else{
            System.out.println("Your ARRAY is empty, Add some Item");
            }
            break;

        case "4":
            break;
            default:
            System.out.println("ERROR! Choose other operation");
            }
        }
    while(!choice.equals("4"));
    }

    static Scanner scan = new Scanner(System.in);
    static String[] array = new String[8];

    static void EnterItem(){
        System.out.print("Input Item: ");
        int arrayIndex = LocEnter();
        array[arrayIndex] = scan.nextLine();
        System.out.println();
    }

    static int LocEnter(){
        int arrayIndex = 0; 
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==null)
            {
                arrayIndex = i;
                break;
            }
        }
        return arrayIndex;
    }

    static void Delete(){
        boolean isPresent = false;
        System.out.print("Enter Value To Remove: ");
        String removeValue = scan.nextLine();
        System.out.println();

        for(int i = 0; i < array.length; i++)
        {
            if(removeValue.equalsIgnoreCase(array[i]))
            {
                isPresent = true;
                break;
            }
        }

        if(isPresent == true)
        {
            int arrayIndex = LocRemove(removeValue);
            array[arrayIndex] = null;
        }
        else
        {
            System.out.println("ERROR! Value Not Found");
        }     
    }

    static int LocRemove(String removeValue){   
        int arrayIndex = 0; 
        for(int i = 0; i < array.length; i++)
        {
            if(removeValue.equalsIgnoreCase(array[i]))
            {
                arrayIndex = i;
                break;
            }
        }
        return arrayIndex;
    }

    static void traverse(){
        System.out.println("Your Array: ");
        for(int i = 0; i < array.length && array[i] != null; i++){
            System.out.println("      " + array[i]);
        }
        System.out.println("  ");
    }

    static boolean full(){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==null)
            {
                return false;
            }
        }
        return true;
    } 

    static boolean empty(){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]!=null)
            {
                return false;
            }
        }
        return true;
    }

    static void OP()
    {
        for(int i = 0; i < array.length - 1; ++i) 
        {
            if(array[i] == null) 
            {
                array[i] = array[i+1];
                array[i+1] = null;
            }
        }
    }

    
}