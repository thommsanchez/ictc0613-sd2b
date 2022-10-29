/*
    ALONZO, Renz Lloyd P.
    BSCS - SD2B
*/

import java.util.Scanner;

public class act04b_sd2b_alonzo
 {
    static Scanner ui = new Scanner(System.in);
    static String [] arr = new String [5];
    
    //Insert Value method
        public static void insertValue()
    {
      {
        for (int i = 0; i< arr.length; i++)
        {
          if (arr[i] == null)
          {
            System.out.println("Insert value: " );
            arr[i]= ui.nextLine();
            break;
          }
          
        }
     }
    }  

    //Delete an element method
    static boolean findLocationDelete()
    {
     
      System.out.println("Delete an element: ");
      String remove = ui.nextLine();

      for(int i = 0; i< arr.length; i++)
      {
        if(remove.equalsIgnoreCase(arr[i]))
        {

          for (int j=i; j<arr.length-1; j++) 
          {
            arr[j] = arr[j+1];
          }

          arr[arr.length-1] = null;
          return false;  
      
        }
      
      }return true;
   
    } 
    
    // Traverse method
    public static void traverse()
    {
      System.out.println("\nCurrent array:");
        for(int i = 0; i < arr.length; i++)
         if(arr[i] != null)
         {
         System.out.print(" " + arr[i]);
         }
        System.out.println(" ");        
    
    }
    
    // Check if array is full
      static boolean arrFull()
    {
        for (String element: arr)
        {
          if (element == null)
          {
            return false;
          }
          
        }  return true;
    }

    // Check if array is empty
    static boolean arrEmpty()
    {
        for (String element: arr)
        {
          if (element != null)

          {
           return false;
          }

        }  return true;
    }


    // Main method 
    public static void main(String[] args) 
   {
    String input;
    do 
      
     {

        System.out.println("\nChoose an array operation: ");

        System.out.println("[1] Insert a value");
        System.out.println("[2] Delete a value");
        System.out.println("[3] Traverse a value");
        System.out.println("[4] Exit");
        System.out.println(" ");
        System.out.println("Enter: ");
        input = ui.nextLine();
        
        switch (input)
        {
            case "1": 
                if (arrFull() == true)
                  {
                   System.out.println(">> Array is full! Delete to insert a value <<");
                  }
                else
                  {
                    insertValue();
                    System.out.println("\n>> Successfully added an element! <<");
                  }
            break;
            case "2":
                  if (arrEmpty() == false)
                  {

                    if (findLocationDelete() == false)
                    {
                      System.out.println(">> Successfully deleted element! <<");
                    }
                    else
                    {
                      System.out.println(">> Element is not inserted in the array! <<");
                    }
                  }
                  else
                  {
                    System.out.println("\n>> No elements are inserted for deletion yet! <<"); 
                  }

            break;
            
            case "3":
                if (arrEmpty() == false)
                {
                   traverse();
                }
                else
                {
                  System.out.println("\n>> No elements added yet! <<"); 
                }

            break;
            case "4":
               {
                   
                System.out.println(">> You have exited the program <<");
                
               }
            break;
            
            default:             
                
                System.out.println("\n>> Invalid input, try again. <<");             
        }
      
     } while (!input.equals("4"));
       
    } 
}