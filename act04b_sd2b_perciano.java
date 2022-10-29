import java.util.Scanner;

public class act04b_sd2b_perciano {
    
    static String[] arry = new String[6];
    static Scanner user = new Scanner(System.in);

     //warning message (full)
        static boolean fullmessageWarning(){
            for(int i = 0; i < arry.length; i++){
                if(arry[i]==null){
                    return false;
                }
            }
            return true;
        } 
    
    //warning message (empty)
        static boolean emptymessageWarning(){
            for(int i = 0; i < arry.length; i++){
                if(arry[i]!=null){
                    return false;
                }
            }
            return true;
        }
        
    //main method
    public static void main(String[] args) {
        String input;

        System.out.println("SELECT AN OPTION:");

        do
        {
            Movefunction();

            System.out.println("[1] Insert a value.");
            System.out.println("[2] Delete a value.");
            System.out.println("[3] Traverse array.");
            System.out.println("[4] Exit.");

            System.out.print("Choice: ");

            input = user.nextLine();
            System.out.println();

            switch(input){
                case "1":
                    if(fullmessageWarning()==false){
                         Insert();
                    }
                    else{
                        System.out.println("FULL!");
                        System.out.println();
                    }
                    break;
                case "2":
                    if(emptymessageWarning()==false){
                        Delete();
    
                    }
                    else{
                        System.out.println("EMPTY!");
                        System.out.println();
                    }
                    break;

                case "3":
                    if(emptymessageWarning()==false){
                        Traverse();
                    }

                    else{
                        System.out.println("EMPTY!");
                        System.out.println();
                    }

                    break;
                case "4":
                    System.out.println("shutting down...");
                    break;

                default:
                    System.out.println("INVALID. PLEASE TRY AGAIN.\n");
            }

        }
        while
        (!input.equals("4"));
    }
    
    //method for 1. Insert a value
    static void Insert(){
        System.out.print("Input content: ");
        int ArrayIndex = Find();
        arry[ArrayIndex] = user.nextLine();
        
        System.out.println();
    }

    //method for 2. Delete a value
    static void Delete(){
        boolean ArrayChecker = false;
        System.out.print("Choose a stored value to delete: ");
        String removeValue = user.nextLine();

        System.out.println();

        for(int i = 0; i < arry.length; i++){
            if(removeValue.equalsIgnoreCase(arry[i])){
                ArrayChecker = true;
                break;
            }
        }
        if(ArrayChecker == true){
            int arryIndex = FindtoDelete(removeValue);
            arry[arryIndex] = null;
        }
        else
        {
            System.out.println("Value not stored in the Array.\n");
        }     
    }

    //method for 3. Traverse array
    static void Traverse(){
        System.out.print("Array stored contents: ");
        for(int i = 0; i < arry.length && arry[i] != null; i++){
            System.out.print(arry[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    static int Find(){
        int arryIndex = 0; 
        for(int i = 0; i < arry.length; i++){
            if(arry[i]==null){
                arryIndex = i;
                break;
            }
        }
        return arryIndex;
    }

    static int FindtoDelete(String removecontent){   
        int ArrayIndex = 0; 
        for(int i = 0; i < arry.length; i++){
            if(removecontent.equalsIgnoreCase(arry[i])){
                ArrayIndex = i;
                break;
            }
        }

        return ArrayIndex;

    }

    //for storing the values to array
    static void Movefunction(){
        for(int i = 0; i < arry.length - 1; ++i) {
            if(arry[i] == null) {
                arry[i] = arry[i+1];
                arry[i+1] = null;
            }
        }
    }
}



