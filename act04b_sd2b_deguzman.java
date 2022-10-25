// Cyril James L. De Guzman SD2B
import java.util.Scanner;

public class act04b_sd2b_deguzman {
    static Scanner scan = new Scanner(System.in);
    //This method finds the index position of where the element need to be insert.
    public static int findLocationInsert(int insElement, int[] arr) {
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                location = i;
                break;
            }
        }
        return location;
    }
    //This method place the element to its designated location.
    public static void insertItem(int[] arr) {
        int insElement;
        System.out.print("Enter element to be inserted: ");
        insElement = scan.nextInt();
        arr[findLocationInsert(insElement, arr)] = insElement;
        //Sorts the array.
        for (int i = 0; i < arr.length; i++) {  
            for (int j = i + 1; j < arr.length; j++) { 
                int tmp = 0;  
                if (arr[j] == 0) {
                    break;
                }
                else if (arr[i] > arr[j]) {  
                    tmp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
        }
    }
    //This method finds the index position of the element to be deleted.
    public static int findLocationDelete(int value, int[] arr) {
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                location = i;
                break;
            }
        }
        return location;
    }
    //This method deletes the element. Also tells if the element to be deleted is in the array or not.
    public static void deleteItem(int[] arr) {
        int delElement;
        boolean isInArray = false;
        System.out.print("Enter element to be deleted: ");
        delElement = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(delElement == arr[i]) {
                isInArray = true;
                break;
            }
        }
        if(isInArray == true) {
            //Set the value of element to be deleted to 0 then moves the preceeding elements to the 0.
            arr[findLocationDelete(delElement, arr)] = 0;
            for (int i = findLocationDelete(delElement, arr); i < arr.length; i++) {  
                for (int j = i + 1; j < arr.length; j++) {           
                    if(arr[i] == 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                    }
                }
            }
            System.out.println("Element " + delElement + " is deleted in the array.");
        }
        else {
            System.out.println("Element " + delElement + " is not in the array.");
        }
    }
    public static void main(String[] args) {
        String choice;
        int size;
        System.out.print("Enter size of the array: ");
        size = scan.nextInt();
        int[] arr = new int[size];
        do { 
            System.out.print("\nArray Basic Operations:" + "\n\t[1] Insert a value." + "\n\t[2] Delete a value"
                + "\n\t[3] Traverse the array" + "\n\t[4] Exit." + "\n\nEnter your choice: ");
            choice = scan.next();
            switch (choice) {
                case "1": 
                    if(arr[size-1] > 0) {
                        System.out.println("The array is already full!");
                        break;
                    }
                    insertItem(arr); 
                    break;
                case "2":
                    if(arr[0] == 0) {
                        System.out.println("The array is empty!");
                        break;
                    }
                    deleteItem(arr); 
                    break;
                case "3":
                    if(arr[0] == 0) {
                        System.out.println("The array is empty!");
                    }
                    else {
                        //Displays the already sorted array.
                        System.out.print("The elements of the array: ");
                        for (int i = 0; i < arr.length; i++) {
                            if(arr[i] == 0) {
                                break;
                            }
                            System.out.print(arr[i] + "   ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case "4":
                    break;
                default:
                    break;
            }
        } while (!choice.equals("4"));
    }
}
