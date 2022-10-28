/*
JOHN DREXLER G. CUBEBE
SD2B - DATA STRUCTURES AND ALGORITHM 
*/
import java.util.Scanner;

public class act04b_sd2b_cubebe 
{
    static Scanner scan = new Scanner(System.in);
    static String[] arraySize = new String[7];   
    
    static boolean checkComplete()
    {
        for(int i = 0; i < arraySize.length; i++)
        {
            if(arraySize[i]==null)
            {
                return false;
            }
        }
            return true;
    }
    
    static boolean checkEmpty()
    {
        for(int i = 0; i < arraySize.length; i++)
        {
            if(arraySize[i]!=null)
            {
                return false;
            }
        }
        return true;
    }
    
    static int findLocationInsert(){
        int arrIndex = 0; 
        for(int i = 0; i < arraySize.length; i++)
        {
            if(arraySize[i]==null)
            {
                arrIndex = i;
                break;
            }
        }
        return arrIndex;
    }
     
    static void insertItem()
    {
        System.out.print("Input Item: ");
        int arrIndex = findLocationInsert();
        arraySize[arrIndex] = scan.nextLine();
        System.out.println();
    }
    
    static int findLocationDelete(String removeValue){   
        int arrIndex = 0; 
        for(int i = 0; i < arraySize.length; i++)
        {
            if(removeValue.equalsIgnoreCase(arraySize[i]))
            {
                arrIndex = i;
                break;
            }
        }
        return arrIndex;
    }
    
    static void deleteItem()
    {
        boolean visible = false;
        System.out.print("Input Value of Item to be Deleted: ");
        String removeValue = scan.nextLine();
        System.out.println();

        for(int i = 0; i < arraySize.length; i++)
        {
            if(removeValue.equalsIgnoreCase(arraySize[i]))
            {
                visible = true;
                break;
            }
        }

        if(visible == true)
        {
            int arrIndex = findLocationDelete(removeValue);
            arraySize[arrIndex] = null;
        }
        else
        {
            System.out.println("Value not in Array\n");
        }     
    }
      
    static void traverseArray()
    {
        System.out.print("The elements of the array are:\t");
        for(int i = 0; i < arraySize.length 
        && arraySize[i] != null; i++)
        {
            System.out.print(arraySize[i] + " ");
        }
        System.out.println("\n");
    }
    
    static void moveNulltoEnd(){
        for(int i = 0; i < arraySize.length - 1; ++i) 
        {
            if(arraySize[i] == null) 
            {
                arraySize[i] = arraySize[i+1];
                arraySize[i+1] = null;
            }
        }
    }
  
    public static void main(String[] args) 
    {
        String choice;

        System.out.println("Welcome!");

        do{
            moveNulltoEnd();
            System.out.println("\nChoose an array operation to perform:" + "\n[1] Insert a value" + "\n[2] Delete a value" + "\n[3] Taverse array" + "\n[4] Exit");
            System.out.print("Choice: ");
            choice = scan.nextLine();  

            switch(choice)
            {
                case "1":
                     if(checkComplete()==false)
                     {
                         insertItem();
                     }
                     else
                     {
                        System.out.println("\nThe array is full! You cannot insert another value.");
                     }
                     break;
                case "2":
                     if(checkEmpty()==false)
                     {
                        deleteItem();
                     }
                     else
                     {
                        System.out.println("\nThe array is empty! You have not inserted any value.");
                     }
                     break;
                case "3":
                     if(checkEmpty()==false)
                     {
                        traverseArray();
                     }
                     else
                     {
                        System.out.println("\nThe array is empty! You have not inserted any value.");
                     }
                     break;
                case "4":
                     break;
                default: 
                     System.out.println("\nThis operation is not read. Please select another operation.");
            }
          }while(!choice.equals("4"));
    }
}