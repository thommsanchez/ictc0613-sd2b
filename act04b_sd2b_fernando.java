import java.util.Scanner;

public class act04b_sd2b_fernando {

    static Scanner sc = new Scanner(System.in);
    static String[] arr = new String[5];

    static void insertItem(){
        System.out.print("Input Item: ");
        int arrIndex = findLocationInsert();
        arr[arrIndex] = sc.nextLine();
        System.out.println();
    }

    static int findLocationInsert(){
        int arrIndex = 0; 
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==null){
                arrIndex = i;
                break;
            }
        }
        return arrIndex;
    }

    static void deleteItem(){
        boolean isPresent = false;
        System.out.print("Input Value of Item to be Deleted: ");
        String removeValue = sc.nextLine();
        System.out.println();

        for(int i = 0; i < arr.length; i++){
            if(removeValue.equalsIgnoreCase(arr[i])){
                isPresent = true;
                break;
            }
        }

        if(isPresent == true){
            int arrIndex = findLocationDelete(removeValue);
            arr[arrIndex] = null;
        }else{
            System.out.println("Value not in Array\n");
        }     
    }

    static int findLocationDelete(String removeValue){   
        int arrIndex = 0; 
        for(int i = 0; i < arr.length; i++){
            if(removeValue.equalsIgnoreCase(arr[i])){
                arrIndex = i;
                break;
            }
        }
        return arrIndex;
    }

    static void traverseArray(){
        System.out.print("Array Content:\t");
        for(int i = 0; i < arr.length && arr[i] != null; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

    static boolean isFull(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==null){
                return false;
            }
        }
        return true;
    } 

    static boolean isEmpty(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=null){
                return false;
            }
        }
        return true;
    }

    static void moveArrayContents_nullEnd(){
        for(int i = 0; i < arr.length - 1; ++i) {
            if(arr[i] == null) {
                arr[i] = arr[i+1];
                arr[i+1] = null;
            }
        }
    }

    public static void main(String[] args) {
        String choice;

        System.out.println("Welcome to Array Operations!");

        do{
            moveArrayContents_nullEnd();

            System.out.println("[1] Insert a value");
            System.out.println("[2] Delete a value");
            System.out.println("[3] Traverse array");
            System.out.println("[4] Exit");

            System.out.print("Choice: ");
            choice = sc.nextLine();
            System.out.println();

            switch(choice){
                case "1":
                    if(isFull()==false){
                         insertItem();
                    }else{
                        System.out.println("Array is Full, Please Delete an Item\n");
                    }
                    break;
                case "2":
                    if(isEmpty()==false){
                        deleteItem();
    
                    }else{
                        System.out.println("Empty Array, Please Insert Values First\n");
                    }
                    break;
                case "3":
                    if(isEmpty()==false){
                        traverseArray();
                    }else{
                        System.out.println("Empty Array, Please Insert Values First\n");
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid Operation, Choose Operation Again\n");
            }
        }while(!choice.equals("4"));
    }
}
