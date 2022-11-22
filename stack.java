// Stack Operations using Linked List for unknown size/lenght
//  Input is managed by Scanner method

import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class MyStackOperations {
    public int data;
    public MyStackOperations next;
    public static MyStackOperations top = null;
    public static MyStackOperations temp = null;
    
    public static void main(String args[]) throws IOException {
        int num, choice, x = 0;
        Scanner reader = new Scanner(System.in);
        
        while(x == 0){
            System.out.println("\nMENU FOR IMPLEMENTING STACK OPERATIONS");
            System.out.println("1. Push\n2. Pop\n3. Stack Top\n");
            System.out.print("Enter your number of choice: ");
            choice = reader.nextInt();
            
            switch(choice){
                case 1:
                    x = 0;
                    System.out.print("Enter value for the node: ");
                    num = reader.nextInt();
                    MyStackOperations temp = new MyStackOperations(num, null);
                    push(temp);
                    break;
                
                case 2:
                    x = 0;
                    pop();
                    break;
                    
                case 3:
                    x = 0;
                    System.out.print("Here are the elements in the stack: ");
                    stackTop();
                    break;
                
                default:
                    x = 1;
                    System.out.println("Invalid input!");
            }
        }
    } // end of main
    
    // Method for creating nodes
    public MyStackOperations(int d, MyStackOperations n){
        data = d;
        next = n;
    }
    
    // Push operation which inserts an element into the stack
    public static void push(MyStackOperations temp){
        temp.next = top;
        top = temp;
    }
    
    //Pop operation which deletes an element out of the stack
    public static void pop(){
        if(top != null){
            System.out.print("The popped element is " + top.data + ".");
            top=top.next;
        } else {
            System.out.print("\nStack Underflow!");
        }
    }
    
    // stackTop operation shows the elements in the stack
    public static void stackTop(){
        temp = top;
        if(temp == null){
            System.out.println("\nStack is empty!");
        }
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }
}
