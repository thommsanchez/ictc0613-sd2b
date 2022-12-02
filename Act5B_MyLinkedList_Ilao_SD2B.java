
/*
 ILAO, Hazee Marie D.
 BSCS-SD2B
 Activity 05B
 */

import java.util.Scanner;
public class Act5B_MyLinkedList_Ilao_SD2B {

    public Act5B_MyLinkedList_Ilao_SD2B next; 
    public static Act5B_MyLinkedList_Ilao_SD2B fNode;
    public static Act5B_MyLinkedList_Ilao_SD2B lNode = null; 
    public String fName, mName, lName, telNum, gender;
    public int arCode, age;
    
    public Act5B_MyLinkedList_Ilao_SD2B(String[] info, Act5B_MyLinkedList_Ilao_SD2B link) {

        fName = info[0];
        mName = info[1];
        lName = info[2];
        arCode = Integer.parseInt(info[3]);
        telNum = info[4];
        gender = info[5];
        age = Integer.parseInt(info[6]);
        next = link;
    }
    public static void main(String[] args) throws Exception {
    Scanner read = new Scanner(System.in);

    System.out.println("Welcome, Science Club Members! \n");

    String[] info = new String[7];
    int infoNum;

        System.out.print("Enter how many members' information will be collected: ");
        infoNum = read.nextInt();
        read.nextLine();
        System.out.println(); 

    for (int i = 0; i < infoNum; i++) {

        System.out.print("Kindly give the information of member no. " + (i+1) + ("\n"));
        System.out.print("First Name: ");
        info[0] = read.next();
        System.out.print("Middle Name: ");
        info[1] = read.next();
        System.out.print("Last Name: ");
        info[2] = read.next();
        System.out.print("Area Code: ");
        info [3] = read.next();
        System.out.print("Telephone Number: ");
        info [4] = read.next();
        System.out.print("Gender: ");
        info [5] = read.next();
        System.out.print("Age: ");
        info [6] = read.next();
        System.out.println();

    Act5B_MyLinkedList_Ilao_SD2B nodes = new Act5B_MyLinkedList_Ilao_SD2B(info, null);

            if (lNode != null) {
                lNode.next = nodes;
                lNode = nodes;
            } else {
                fNode = nodes;
                lNode = nodes;
            }
        }

        System.out.println("--------------------------- OUTPUT --------------------------- "); 

    Act5B_MyLinkedList_Ilao_SD2B f = fNode;   
    while (f != null) {

       System.out.println();
       System.out.printf("Welcome to the club %s %s %s!%n", f.fName, f.mName, f.lName);
       System.out.printf("Your Area Code and Telephone Number is (%s) %s.%n", f.arCode, f.telNum);
       System.out.printf("You are a %s member, and your Age is %s.%n%n", f.gender, f.age);

        f = f.next;
        } 
    }
}