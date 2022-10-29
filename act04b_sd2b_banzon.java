/*
    BANZON, Jhaztine Mikhaela B.
    BSCS-SD2B
*/
package act04b;

import java.util.*;

public class act04b_sd2b_banzon
{
    static Scanner scan = new Scanner(System.in);
    static String myArray[] = new String [5];
    static String choice, insertStr, deletedStr;
    static boolean b;

    public static void main(String[] args)
    {
        System.out.println(" ‧₊˚✩彡 Welcome to Array Builder! ‧₊˚✩彡 ");
        System.out.println("     By Jhaztine Mikhaela B. Banzon");
        System.out.println("                ٩(ˊᗜˋ*)و");
        
        do{
            System.out.println("\n1. Insert a value");
            System.out.println("2. Delete a  value");
            System.out.println("3. Traverse array");
            System.out.println("4. Exit");             
            System.out.print("\nWhat do you want to do? ");
            choice = scan.nextLine();

            switch(choice)
            {
                case "1":
                    if (arrayFull() == true)
                    {
                        System.out.println("\n\tThe array is full!");
                    }
                    else
                    {
                        System.out.println("\n\tThe array is not full.");
                        System.out.print("\n\tEnter value to insert: ");
                        insertStr = scan.nextLine();
                        insertVal();            
                    }
                break;

                case "2": 
                    if (arrayEmpty() == false)
                    {                        
                        
                        if (goDelete() == true)
                            {
                                System.out.println("\n\tYou have deleted " + deletedStr + " from the array." );
                            }
                        else
                            {
                                System.out.println("\n\tThere is no such value in the array!");
                            }                            
                    }
                break;

                case "3":
                    traverseDisplay();
                break;

                case "4":
                    System.out.println("\n    ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
                    System.out.println("   ★ ✩ You have exited the program ✩ ★");
                    System.out.println("   ★ ✩ ✩ ✩ ✩ ✩ Goodbye! ✩ ✩ ✩ ✩ ✩ ★");                        
                    System.out.println("   ★ ✩ Thank you for using (^•ﻌ•^)♡ ✩ ★");
                    System.out.println("   ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★\n");
                break;
                
                default:
                    System.out.println("\n\tYou have entered an invalid keyword.");
            }
        } while (!choice.equals("4"));
    }
    public static boolean arrayFull()
    {
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[i] == null)
            return false;
        }
        return true;
    }  
    public static void insertVal()
    {
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[i] == null)
            {
                myArray[i] = insertStr;
                System.out.println("\n\tYou have inserted " + insertStr + ".");
                break;
            }
        }        
    }
    public static int findLocationDelete(String deleteStr)
    {               
        int indexDel = 0;
        b = false;
        
        for (int i=0; i<myArray.length; i++)
            {
                if (deleteStr.equals(myArray[i]))
                {
                    indexDel = i;
                    b = true;
                    break;
                }
            }
        return indexDel;
    }
    public static boolean goDelete()
    {
        System.out.print("\n\tEnter value to delete: ");
        String deleteStr = scan.nextLine();

        findLocationDelete(deleteStr);
            
        if (b==true)
        {
            if (findLocationDelete(deleteStr) == 0)
            {
                myArray[findLocationDelete(deleteStr)] = null;

                for (int j=0; j<myArray.length-1; j++)
                {
                    myArray[j] = myArray[j+1];
                }
            }
            else
            {   
                for (int j=findLocationDelete(deleteStr); j<myArray.length-1; j++)
                {
                    myArray[j] = myArray[j+1];
                }                
            }
            myArray[4] = null;                    
            deletedStr = deleteStr;
            return true;
        }  
        return false;
    }
    public static boolean arrayEmpty()
    {
        for (int i=0; i<myArray.length; i++)
        {
            if (myArray[0] == null)
            {
                System.out.println("\n\tThe array is empty!");                
                return true;
            }
        }
        return false;
    }
    public static void traverseDisplay()
    {
        System.out.println("\n\tARRAY ELEMENTS:");
        
        for (int i=0; i<myArray.length && myArray[i] != null ; i++)
        {
            System.out.print("    " + myArray[i]);
        }
        System.out.println();
    }  
}