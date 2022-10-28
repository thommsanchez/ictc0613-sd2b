package sd2b.datastructure;

import java.util.Scanner;

public class Activity04b_SD2B_Serrano {
    
    static Scanner n = new Scanner(System.in);
    static String[] x = new String[10];

    static void insertItem(){
        System.out.println("Input Item: ");
        int xIndex = findLocationInsert();
        x[xIndex] = n.nextLine();
        System.out.println();
    }

    static int findLocationInsert(){
        int xIndex = 0; 
        for(int i = 0; i < x.length; i++){
            if(x[i]==null){
                xIndex = i;
                break;
            }
        }
        return xIndex;
    }

    static void deleteItem(){
        boolean pasok = false;
        System.out.println("Input Value of Item to be Deleted: ");
        String tanggal = n.nextLine();
        System.out.println();

        for(int i = 0; i < x.length; i++){
            if(tanggal.equalsIgnoreCase(x[i])){
                pasok = true;
                break;
            }
        }

        if(pasok == true){
            int xIndex = findLocationDelete(tanggal);
            x[xIndex] = null;
        }else{
            System.out.println("Value not in Array\n");
        }     
    }

    static int findLocationDelete(String tanggal){   
        int xIndex = 0; 
        for(int i = 0; i < x.length; i++){
            if(tanggal.equalsIgnoreCase(x[i])){
                xIndex = i;
                break;
            }
        }
        return xIndex;
    }

    static void traverseArray(){
        System.out.println("Array Content:\t");
        for(int i = 0; i < x.length && x[i] != null; i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println("\n");
    }

    static boolean isFull(){
        for (String b : x) {
            if (b == null) {
                return false;
            }
        }
        return true;
    } 

    static boolean isEmpty(){
        for (String b : x) {
            if (b != null) {
                return false;
            }
        }
        return true;
    }

    static void moveArrayContents_nullEnd(){
        for(int i = 0; i < x.length - 1; ++i) {
            if(x[i] == null) {
                x[i] = x[i+1];
                x[i+1] = null;
            }
        }
    }

    public static void main(String[] args) {
        String option;

        System.out.println("Welcome to Array Operations!");

        do{
            moveArrayContents_nullEnd();

            System.out.println("[A] Insert a value");
            System.out.println("[B] Delete a value");
            System.out.println("[C] Traverse array");
            System.out.println("[D] Exit");

            System.out.println("OPTION: ");
            option = n.nextLine();
            System.out.println();

            switch(option){
                case "A":
                    if(isFull()==false){
                         insertItem();
                    }else{
                        System.out.println("Array is Full, Please Delete an Item\n");
                    }
                    break;
                case "B":
                    if(isEmpty()==false){
                        deleteItem();
    
                    }else{
                        System.out.println("Empty Array, Please Insert Values First\n");
                    }
                    break;
                case "C":
                    if(isEmpty()==false){
                        traverseArray();
                    }else{
                        System.out.println("Empty Array, Please Insert Values First\n");
                    }
                    break;
                case "D":
                    break;
                default:
                    System.out.println("Invalid Operation, Choose Operation Again\n");
            }
        }while(!option.equals("D"));
    }
}
