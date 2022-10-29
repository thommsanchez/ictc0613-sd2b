package ICTC0613;
import java.util.Scanner;

public class Activity04b_SD2B_Reyes
{
    static Scanner input = new Scanner(System.in);
    static String[] arrayOperations = new String[9];

    public static void main(String[] args) 
    {
        String choice;
        System.out.println("Welcome to Array Operations!");
        System.out.println("");
        System.out.println("What do you want to do? \n");

        do{
            sortedLinearArray();

            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[4] Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextLine();
            System.out.println();

            switch(choice)
            {
                case "1":
                    if(full()==false)
                    {
                         insertValue();
                    }
			  else
 	 	        {
                        System.out.println("Array is full!\n");
                    }
                    break;
                case "2":
                    if(empty()==false)
                    {
                        deleteItem();
                    }
                    else
                    {
                        System.out.println("Array is empty!");
                    }
                    break;
                case "3":
                    if(empty()==false)
                    {
                        traverseArray();
                    }
                    else
                    {         
                        System.out.println("Array is empty!\n");
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Operation is invalid!\n");
            }    
        }
        while (!choice.equals("4"));
    }
    
    static void insertValue()
    {
        System.out.print("Enter element to insert: \t");
        int insertLocation = findLocationInsert();
        arrayOperations[insertLocation] = input.nextLine();
        System.out.println();
    }

    static int findLocationInsert()
    {
        int insertLocation = 0;
        for(int i = 0; i < arrayOperations.length; i++)
        { 
            if (arrayOperations[i] == null)
            {
            insertLocation = i;
            break;
            }
        }
        return insertLocation;
    }

    static void deleteItem()
    {
        boolean present = false;
        System.out.print("Enter element to delete: ");
        String deleteValue = input.nextLine();
        System.out.println();

        for(int i = 0; i < arrayOperations.length; i++)
        {
            if(deleteValue.equalsIgnoreCase(arrayOperations[i]))
            {
                present = true;
                break;
            }
        }

        if(present == true)
        {
            int index = findLocationDelete(deleteValue);
            arrayOperations[index] = null;
        }
        else
        {
            System.out.println("The element you entered doesn't exist!");
        }
    }

    static int findLocationDelete(String deleteValue){
        int index = 0;

        for(int i = 0; i < arrayOperations.length; i++)
        {
            if(deleteValue.equalsIgnoreCase(arrayOperations[i]))
            {  
                index = i;
                break;
            }
        }
        return index;
    }

    static void traverseArray()
    {
        System.out.print("The contents of the array are :\t");
        for(int i = 0; i < arrayOperations.length && arrayOperations[i] != null; i++)
        {
            System.out.print(arrayOperations[i] + "\t");
        }
        System.out.println("\n");
    }

    static boolean full()
    {
        for(int i = 0; i < arrayOperations.length; i++)
        {
            if(arrayOperations[i]==null)
            {
                return false;
            }
        }
        return true;
    } 

    static boolean empty(){
        for(int i = 0; i < arrayOperations.length; i++)
        {
            if(arrayOperations[i]!=null)
            {
                return false;
            }
        }
        return true;
    }

    static void sortedLinearArray()
    {
        for(int i = 0; i < arrayOperations.length - 1; ++i)
        {
            if(arrayOperations[i] == null)
            {
                arrayOperations[i] = arrayOperations[i + 1];
                arrayOperations [i + 1] = null;
            }
        }
    } 
}



            
 
            
    
