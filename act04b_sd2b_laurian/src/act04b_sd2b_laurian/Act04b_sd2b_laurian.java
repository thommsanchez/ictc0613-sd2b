/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act04b_sd2b_laurian;

/**
 *
 * @author janjan
 */
import java.util.Scanner;

public class Act04b_sd2b_laurian {

    //declaration of all variables that is accessible to all methods
    public static int length = 10;
    public static Integer array[] = new Integer[length];
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose an action: ");
            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[0] Exit");
            System.out.print("Enter input: ");

            int option = scan.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    traverse();
                    break;
                default:
                    System.out.println("Invalid input try again");
                    System.out.println("");
            }
            if (option == 0) {
                break;
            }
        }
    }

    static void insert() {
        int value;
        if (checkIfFull()) {
            System.out.println("!!THE ARRAY IS ALREADY FULL!!");
            System.out.println("");
        } else {
            System.out.print("Input number you want to insert: ");

            value = scan.nextInt();
            for (int i = 0; i < length; i++) {
                if (array[i] == null) {
                    array[i] = value;
                    break;
                } else {
                    continue;
                }
            }
            System.out.println("Value inserted.");
            System.out.println("");
        }
    }

    static void delete() {
        int value;
        if (checkIfEmpty()) {
            System.out.println("!!THE ARRAY IS ALREADY EMPTY!!");
            System.out.println("");
        } else {
            System.out.print("Input number you want to delete: ");
            value = scan.nextInt();
            findLocationDelete(value);
            System.out.println("");
        }

    }

    static void findLocationDelete(int value) {
        boolean noValue = false;
        for (int i = 0; i < length; i++) {
            if (array[i] != null) {
                if (array[i] == value) {
                    array[i] = null;
                    sortArray(i);
                    System.out.println("First matched value deleted.");
                    noValue = false;
                    break;
                }
            } else {
                noValue = true;
                break;
            }
        }
        if (noValue) {
            System.out.println("!!THE VALUE DOES NOT EXIST!!");
        }

    }

    static void traverse() {
        String output = "The Array contains "; 
        if (checkIfEmpty() == true) {
            output += "nothing.";
            System.out.println(output);
            System.out.println("");
        } else {
            for (int i = 0; i < length; i++) {
                if (array[i] != null) {
                    output += array[i] + " ";
                } else {
                    break;
                }
            }
            System.out.println(output);
            System.out.println("");
        }

    }

    static boolean checkIfFull() {
        if (array[length-1] == null) return false;
        return true;
    }

    static boolean checkIfEmpty() {
        if (array[0] == null) return true;
        return false;
    }

    static void sortArray(int index) {
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }

    }
}
