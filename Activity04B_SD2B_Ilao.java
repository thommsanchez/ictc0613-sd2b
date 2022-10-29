import java.util.Scanner;
public class Activity04B_SD2B_Ilao {

    public static void insertValue() {
        int insertVal;
        if(full()) {
            System.out.println("Array is full.");  
            System.out.println("");  
        } else {
            System.out.print("Input the value you want to insert: ");

            insertVal = sc.nextInt();
            for(int i = 0; i < size; i++) {
                if (array[i] == null) {
                    array[i] = insertVal;
                    break;
                } else {
                    continue;
                }
            } System.out.println("The value has been inserted.");
              System.out.println("");
        }
    }

    public static void deleteValue() {
        int insertVal;
        if(empty()) {
            System.out.println("Array is empty.");
            System.out.println("");
        } else {
            System.out.print("Input the value you want to delete: ");
            insertVal = sc.nextInt();
            findLocationDelete(insertVal);
            System.out.println("");
        }
    }

    public static void findLocationDelete(int insertVal) {
        boolean value = false;
        for(int i = 0; i < size; i++) {
            if(array[i] != null) {
                if(array[i] == insertVal) {
                    array[i] = null;
                    sortArray(i);
                    System.out.println("The value has been deleted.");
                    value = false;
                    break;
                }
            } else {
                value = true;
                break;
            }
        } if(value) {
            System.out.println("The value does not exist.");
        }
    }

    public static void traverseValue() {
        String result = "Array List: ";
        if(empty() == true) {
            result += "Empty: Please insert a value.";
            System.out.println(result);
            System.out.println("");
        } else {
            for(int i = 0; i < size; i++) {
                if(array[i] != null) {
                    result += array[i] + " ";
                } else {
                    break;
                }
            } System.out.println(result);
              System.out.println("");
        }
    }

    public static boolean full() {
        if(array[size-1] == null) return false;
        return true;
    }

    public static boolean empty() {
        if(array[0] == null) 
        return true;
        return false;
    }

    public static void sortArray(int sort) {
        for(int i = sort; i < size-1; i++) {
            array[i] = array[i+1];
            array[i+1] = null;
        }
    }

    static int size = 5;
    static Integer array[] = new Integer[size];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while(true) {
            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse a value");
            System.out.println("[4] Exit Program \n");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insertValue();
                    break;
                case 2:
                    deleteValue();
                    break;
                case 3:
                    traverseValue();
                    break;
                case 4: 
                    break;
                default:
                    System.out.println("Invalid Input, please try again.");
                    System.out.println("");  
            } if(choice == 4) {
                break;
            }

        }    
       
    }
}
