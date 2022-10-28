package act04b_sd2b_batol;
import java.util.Scanner;
public class Act04b_sd2b_batol {
    private int[] array;
    private int currentSize;
    
    public Act04b_sd2b_batol() {
        this(10);
    }
    
    public Act04b_sd2b_batol(int size) {
        array = new int[size];
        currentSize = 0;
    }
    
    public void insertItem(int item){
        if (currentSize < array.length) {
            int insertLocation = findLocationInsert(item);
            for (int i = currentSize - 1; i >= insertLocation; i--) {
                array[i +1] = array[i];
            }
            array[insertLocation] = item;
            currentSize++;
        }
    }
    
    private int findLocationInsert(int item){
        for (int i = 0; i < currentSize; i++){
            if (array[i] > item) {
                return i;
            }
        }
        return currentSize;
    }
    
    public void deleteItem(int item){
        int deleteLocation = findLocationDelete(item);
        if (deleteLocation != -1) {
            for (int i = deleteLocation + 1; i < currentSize; i++) {
                array [i - 1] = array[i];
            }
            currentSize--;
        }
    }
    
    private int findLocationDelete(int item) {
        for (int i = 0; i < currentSize; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }
    
    public void printArray() {
        System.out.println("The element(s) of the array: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.println(array[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Act04b_sd2b_batol act04b_sd2b_batol = new Act04b_sd2b_batol();
        Scanner in = new Scanner(System.in);
        
        String choice;
        
        while (true) {
            System.out.println("Array Operation Options:");
            System.out.println("\n1. Insert a value"
                    + "\n2. Delete a value"
                    + "\n3. Traverse the array"
                    + "\n4. Exit");
            System.out.print("Enter your choice: ");
            
            choice =in.nextLine();
            
            switch (choice) {
                case "1":
                    System.out.print("Enter element to be inserted: ");
                    act04b_sd2b_batol.insertItem(Integer.parseInt(in.nextLine()));
                    System.out.println("\n");
                    break;
                    
                case "2":
                    System.out.print("Enter element to deleted: ");
                    act04b_sd2b_batol.deleteItem(Integer.parseInt(in.nextLine()));
                    break;
                    
                case "3":
                    act04b_sd2b_batol.printArray();
                    break;
                    
                case "4":
                    System.exit(0);
            }
        }
    }
}
