import java.util.Scanner;

public class Activity04B_SD2B_Daproza {
    public static Scanner scan = new Scanner(System.in);
    
    public static int InsertLocation(int val, int[] array) {
        int location = 0;
        for (int x = 0; x < array.length; x++) {
            if(array[x] == 0) {
                location = x;
                break;
            }

        }
        return location;
    }
    public static void Inserttoplace(int[] array) {
        int val;
        System.out.print("Insert a value: ");
        val = scan.nextInt();
        array[InsertLocation(val, array)] = val;
        for (int x = 0; x < array.length; x++) {  
            for (int y = x + 1; y < array.length; y++) { 
                int tmp = 0;  
                if (array[y] == 0) {
                    break;
                }
                else if (array[x] > array[y]) {  
                    tmp = array[x];  
                    array[x] = array[y];  
                    array[y] = tmp;  
                }  
            }  
        }
    }
    public static int DeleteValue(int value, int[] array){
        int place = 0 ;
        for (int x = 0; x < array.length; x++) {
            if(array[x] == value) {
                place = x;
                break;
            }
        }
        return place;
    }
    public static void Delete(int[] array) {
        int deleteval;
        boolean isInArray = false;
        System.out.print("Enter element to be deleted: ");
        deleteval = scan.nextInt();
        for (int x = 0; x < array.length; x++) {
            if(deleteval == array[x]) {
                isInArray = true;
                break;
            }
        }
        if(isInArray == true) {
            array[DeleteValue(deleteval, array)] = 0;
            for (int x = DeleteValue(deleteval, array); x < array.length; x++) {  
                for (int y = x + 1; y < array.length; y++) {           
                    if(array[x] == 0) {
                        array[x] = array[y];
                        array[y] = 0;
                    }
                }
            }
            System.out.println("Element " + deleteval + " is deleted in the array.");
        }
        else {
            System.out.println("Element " + deleteval + " is not in the array.");
        }
    }
    public static void main(String[] args) {
        int choice;
        int size;
        System.out.print("insert the  size of the array: ");
        size = scan.nextInt();
        int[] array = new int[size];
        while (true){ 
            System.out.print("\nArray Basic Operations:" + "\n\t[1] Insert a value." + "\n\t[2] Delete a value"
                + "\n\t[3] Traverse the array" + "\n\t[4] Exit." + "\n\nEnter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1: 
                    if(array[size-1] > 0) {
                        System.out.println("The array is already full!");
                        break;
                    }
                    Inserttoplace(array); 
                    break;
                case 2:
                    if(array[0] == 0) {
                        System.out.println("The array is empty!");
                        break;
                    }
                    Delete(array); 
                    break;
                case 3:
                    if(array[0] == 0) {
                        System.out.println("The array is empty!");
                    }
                    else {
                        //Displays the already sorted array.
                        System.out.print("The elements of the array: ");
                        for (int x = 0; x < array.length; x++) {
                            if(array[x] == 0) {
                                break;
                            }
                            System.out.print(array[x] + "   ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    break;
                default:
                    break;
                    
            }
            if (choice == 4){
                break;
            }  
        }    
    }
}