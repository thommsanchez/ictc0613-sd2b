
import java.util.Scanner;
public class act04b_sd2b_deguzman {
     static Scanner scan = new Scanner(System.in);
       static int depot, depot2;
       static String [] arr = new String [5];


    //Delete array
    static boolean findLocationDelete()
    {
        int n = 4;
        System.out.print("Delete an element: ");
        String remove = scan.nextLine();
        for (int i=0; i<arr.length; i++)
        {
            if (remove.equalsIgnoreCase(arr[i]))
            {
                for (int j=i; j<arr.length-1; j++)
                {
                    arr[j] = arr[j+1];
                }
                    return true;
                }
                arr[n]=null;
        }           
        return false;
    } 
    
    
    // Check if array is full
    static boolean full()
    {
        for (int i = 0; i< depot ; i++)
        {
            if (arr[i] == null)
            {
                return false;
            }
        }  
        return true;
    }

    
    // Check if array empty
    static boolean empty()
    {
        for (int i = 0; i< depot ; i++)
        {
            if (arr[i] != null)
            {
                return false;
            }
        } 
         return true;
    }
    
    
    //InsertValue
    public static void insert()
    {
        for (int i = 0; i< depot ; i++)
        {
            if (arr [i] == null)
            {
                System.out.print("Insert value: " );
                arr [i]= scan.nextLine();
                depot2--;
                     if (0 < depot2){                       
                         System.out.println("Array is not full ");
                     }
                     else {
                         System.out.println("Array is already full, you can't insert another element");
                     }     
                break;
            }  
        }
    }

    
    // Traverse method
    public static void traverse()
    {     
        System.out.print("\nThe current array: ");
        for(int i = 0; i < depot ; i++)
        if(arr[i] != null)
        {
            System.out.print(arr[i] + "  ");
        }
    }
      

    // Main method 
    public static void main(String[] args) 
    {
        String input;  
        depot = 5;
        depot2 = depot;
        System.out.println("Welcome to  Array Operation!! ");
        do 
        {
            System.out.println("\nChoose an array operation: ");
            System.out.println("    [1] Insert a value");
            System.out.println("    [2] Delete a value");
            System.out.println("    [3] Traverse array");
            System.out.println("    [4] Exit");
            System.out.println(" ");
            System.out.print("Enter your chosen operation: ");
            input = scan.nextLine();
            switch (input)
            {
                case "1": 
                    if (full() == true)
                    {
                    System.out.println("Array is full!"); 
                    }
                    else
                    {
                    insert();     
                    }
                break;
                
                case "2":
                    if (empty() == false)
                    {
                        if (findLocationDelete() == true)
                        {
                        System.out.println("Successfully deleted  ");
                        }
                        else
                        {
                        System.out.println("Element is not in the array!");
                        }
                    }
                    else
                    {
                    System.out.println("\nNo elements added to delete!"); 
                    }
                break;
            
                case "3":
                    if (empty() == false)
                    {
                    traverse();
                    }
                    else
                    {
                    System.out.println("\nNo elements added!"); 
                    }
                break;
                case "4":
                    System.out.println("\nThank you for using the program!");
                    break;
                default:
                     System.out.println("Invalid Operation, Please choose operation again\n");
            }
        }  
                while(!input.equals("4"));
    } 
}