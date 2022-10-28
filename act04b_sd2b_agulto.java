import java.util.Scanner;

public class act04b_sd2b_agulto
{
    public static void main(String[] args) 
    {
        String choice;
        System.out.println("Hello! Welcome to Java Array Operations!");

        do{
            arrayOperations();

            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[4] Exit");

            System.out.print("Please enter the number of the operation you want to use: ");
            choice = sc.nextLine();
            System.out.println();

            switch(choice)
            {
                case "1":
                    if(full()==false)
                    {
                         insertValue();
                    }else{
                        System.out.println("Oh no! Your Array is full already, please delete an item to add a new one!\n");
                    }
                    break;
                case "2":
                    if(empty()==false)
                    {
                        deleteItem();
    
                    }else{
                        System.out.println("Whoops! Your array is still empty, please insert a value!\n");
                    }
                    break;
                case "3":
                    if(empty()==false)
                    {
                        traverseArray();
                    }else{         
                        System.out.println("Whoops! Your array is still empty, please insert a value!\n");
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println(" Yikes! You have selected a invalid operation, kindly choose a new operation again!\n");
            }
        }while(!choice.equals("4"));
    }
    
    static Scanner sc = new Scanner(System.in);
    static String[] array = new String[10];


    static void insertValue()
    {
        System.out.print("Enter the value of the item you want to insert: ");
        int index = findLocationInsert();
        array[index] = sc.nextLine();
        System.out.println();
    }

    static int findLocationInsert()
    {
        int index = 0; 
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==null)
            {
                index = i;
                break;
            }
        }
        return index;
    }

    static void deleteItem()
    {
        boolean present = false;
        System.out.print("Enter the value of the item you want to be deleted: ");
        String deleteValue = sc.nextLine();
        System.out.println();

       
        for(int i = 0; i < array.length; i++)
        {
            if(deleteValue.equalsIgnoreCase(array[i]))
            {
                present = true;
                break;
            }
        }

        if(present == true)
        {
            int index = findLocationDelete(deleteValue);
            array[index] = null;
        }else
        {
            System.out.println("The value of the item you entered doesn't exist in array\n");
        }     
    }

    static int findLocationDelete(String deleteValue)
    {   
        int index = 0; 
        for(int i = 0; i < array.length; i++)
        {
            if(deleteValue.equalsIgnoreCase(array[i]))
            {
                index = i;
                break;
            }
        }
        return index;
    }

    static void traverseArray()
    {
        System.out.print("The contents of your array are :\t");
        for(int i = 0; i < array.length && array[i] != null; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n");
    }

    static boolean full()
    {
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

    static void arrayOperations()
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