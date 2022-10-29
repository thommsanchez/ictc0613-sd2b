import java.util.Scanner;

public class Act04b_sd2b_Apad {
	public static int arrSize = 10;
    public static Integer array[] = new Integer[arrSize];
    public static Scanner sc = new Scanner(System.in);
	
	static void insertItem() {
			int input;
			if (ifFull()) {
				System.out.println("!!THE ARRAY IS ALREADY FULL!!");
				System.out.println("");
			} else {
				System.out.print("Input number you want to insert: ");

				input = sc.nextInt();
				for (int i = 0; i < arrSize; i++) {
					if (array[i] == null) {
						array[i] = input;
						break;
					} else {
						continue;
					}
				}
				System.out.println("Value inserted.");
				System.out.println("");
			}
		}

		static void deleteItem() {
			int val;
			if (ifEmpty()) {
				System.out.println("The array is empty.");
				System.out.println("");
			} else {
				System.out.print("Input number you want to delete: ");
				val = sc.nextInt();
				findLocationDelete(val);
				System.out.println("");
			}

		}

		static void findLocationDelete(int value) {
			boolean none = false;
			for (int i = 0; i < arrSize; i++) {
				if (array[i] != null) {
					if (array[i] == value) {
						array[i] = null;
						sortArray(i);
						System.out.println("First matched value deleted.");
						none = false;
						break;
					}
				} else {
					none = true;
					break;
				}
			}
			if (none) {
				System.out.println("Value does not exist.");
			}

		}

		static void traverseValue() {
			String show = "The Array contains "; 
			if (ifEmpty() == true) {
				show += "nothing.";
				System.out.println(show);
				System.out.println("");
			} else {
				for (int i = 0; i < arrSize; i++) {
					if (array[i] != null) {
						show += array[i] + " ";
					} else {
						break;
					}
				}
				System.out.println(show);
				System.out.println("");
			}

		}	

		static boolean ifFull() {
			if (array[arrSize-1] == null) return false;
			return true;
		}

		static boolean ifEmpty() {
			if (array[0] == null) return true;
			return false;
		}

		static void sortArray(int index) {
			for (int i = index; i < arrSize - 1; i++) {
				array[i] = array[i + 1];
				array[i + 1] = null;
			}

		}
	public static void main(String[] args) {
        while (true) {
            System.out.println("Select an action to be done: ");
            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[0] Exit");
            System.out.print("Insert Choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insertItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    traverseValue();
                    break;
                default:
                    System.out.println("Invalid input try again");
                    System.out.println("");
            }
            if (choice == 0) {
                break;
            }
        }
    }
}