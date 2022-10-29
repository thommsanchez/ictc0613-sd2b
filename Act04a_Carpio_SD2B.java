
package act04a_carpio_sd2b;

import java.util.*;
public class Act04a_Carpio_SD2B {
  
    public static Scanner ui = new Scanner(System.in);        
    public static int insert, insertt, tracker = 0;
    public static int a[] = new int [100];
      
     public static void insert(){          
                 for (int i = 0; i < insert; i++){                           
                    if (a[i]==0){                       
                    System.out.print("\nInsert  Elements: ");                    
                    a[i] = ui.nextInt();
                    System.out.println("\n -----Element "+ a[i] + " is added from the array-----\n");
                    insertt--;
                    tracker++;
                     if (0 < insertt){                       
                         System.out.println("!!!! Array is not full " + "insert "+ insertt + " more elements !!!!" );
                     }
                     else {
                         System.out.println("Array is already full, you can't insert another element\n");
                     }     
                     break;
                    }
                 }                                
    }         
         public static int findLocationDelete(){
         boolean flag = false;
         
         System.out.print("\nSearch the element position you want to delete: ");
         int position = ui.nextInt();
           
         for (int i=0; i < insert ; i++){
             if (a[i] == position && a[i] != 0){
                 a[i]=0;
                 delete();
                 flag=true;
                 System.out.println("\n -----Element "+ position + " is removed from the array-----");
                 break;
             }      
         }        
         if (flag == false){
             System.out.println("\n******There is no " + "element "+ position +" in array" + " pls try again ******\n");            
             findLocationDelete();          
         }  
         return position;
     } 
         public static void delete (){
             for (int i = 0; i < insert-1; ++i){
                 if (a[i]==0){
                     a[i] = a[i+1];
                     a[i+1] = 0;                    
                 }         
             }
             insert--;
             tracker--;
         }       
        public static void traverse(){
             
             System.out.println("\n   >>>>>YOUR ELEMENTS IS <<<<<");
      
             for (int i = 0; i < tracker ; i++)
              {
             System.out.print( "   ["+ a[i] + "]     " );               
              }                     
             System.out.println(" ");
     }                
              
        public static boolean empty(){
            if (a[0] == 0)
                return true;
                return false;
        }
        
    public static void main(String[] args) {     
          int choice;   
          System.out.print("\n\n >>>>> Enter length of array: ");
                  insert = ui.nextInt();
                  insertt = insert;
          System.out.println("\nHi! Welcome to  Array Operation!! ");
          
          do{    
        System.out.println("\nChoose Array Operation: ");
        System.out.println("1. Insert a value");
        System.out.println("2. Delete a value");
        System.out.println("3. Traverse array");
        System.out.println("4. Exit");
        System.out.print("\nEnter choice: ");
        choice = ui.nextInt();
        
        switch (choice){         
            case 1:
                if (0 == insertt){
                    System.out.println("Array is already full, pls delete elements to get space");
                }
                else{
                insert();   
                }
                 break;              
            case 2:
                if (empty() == true){
                    System.out.println("\n*****Insert element first to delete a value, choose (Input value) in Array Operation*****");
                }
                else{                   
                    insertt++;
                    insert++;
                findLocationDelete();
                
                }
                break;
                
            case 3:  
                if (empty() == true){
                    System.out.println("\n*****Insert element first, choose (Input value)in Array Operation*****");
                }
                else{
                traverse(); 
                }
                break;
                
            case 4:
                System.out.println("\n>>>>>> Thank you for using the program <<<<<<");
                break;
            
            default:
                System.out.println("\n****** Invalid Keyword, pls try again ******");                
        }      
      
          } while(choice != 4);
    }    
}
