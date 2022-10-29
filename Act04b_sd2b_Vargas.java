import java.util.Scanner;
public class Act04b_Vargas {

    static Scanner sc = new Scanner(System.in);
    static String[] arr = new String[5];
    static void item ()
    {
        System.out.println("Input Item: ");
        int index = findlocation ();
        arr[index] = sc.nextLine();
        System.out.println();
    }

    static int findlocation()
    {
        int index = 0; 
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==null){
                index = i;
                break;
            }
        }
        return index;
    }

    static void delete()
    {
        boolean present = false;
        System.out.println("Input the value of item to be deleted: ");
        String removeValue = sc.nextLine();
        System.out.println();

        for (String arr1 : arr) 
        {
            if (removeValue.equalsIgnoreCase(arr1))
            {
                present = true;
                break;
            }
        }

        if(present == true){
            int arrIndex = findLocationDelete(removeValue);
            arr[arrIndex] = null;
        }else{
            System.out.println("Array value not found");
        }     
    }

    static int findLocationDelete(String delete)
    {   
        int index = 0; 
        for(int i = 0; i < arr.length; i++)
        {
            if(delete.equalsIgnoreCase(arr[i]))
            {
                index = i;
                break;
            }
        }
        return index;
    }

    static void traversearray()
    {
        System.out.println("Array Content:\t");
        for(int i = 0; i < arr.length && arr[i] != null; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }

    static boolean full(){
        for (String arr1 : arr)
        {
            if (arr1 == null) 
            {
                return false;
            }
        }
        return true;
    } 

    static boolean empty()
    {
        for (String arr1 : arr) 
        {
            if (arr1 != null)
            {
                return false;
            }
        }
        return true;
    }

    static void movearray_nullEnd()
    {
        for(int i = 0; i < arr.length - 1; ++i) 
        {
            if(arr[i] == null) {
                arr[i] = arr[i+1];
                arr[i+1] = null;
            }
        }
    }

    public static void main(String[] args)
    {
        String choice;

        System.out.println("Hello, Welcome to Array Operations.");

        do
        {
            movearray_nullEnd();

            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[4] Exit");
            System.out.println("Choice: ");
            choice = sc.nextLine();
            System.out.println();

            switch(choice){
                case "1":
                    if(full()==false){
                         item();
                    }else{
                        System.out.println("The array is full. Delete an item.");
                    }
                    break;
                case "2":
                    if(empty()==false){
                        delete();
    
                    }else{
                        System.out.println("Empty array, Insert values first");
                    }
                    break;
                case "3":
                    if(empty()==false){
                        traversearray();
                    }else{
                        System.out.println("Empty array, Insert values first");
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid Operation, try again");
            }
        }       while(!choice.equals("4"));
    }
}


