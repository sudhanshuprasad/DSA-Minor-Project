package dsa2041016266;

import java.util.Scanner;

public class studentMain {
    public static void main(String[] args) {
        SinglyLinkedList student=new SinglyLinkedList();
        int choice;
        Scanner sc=new Scanner(System.in);
        do {

            System.out.println("Enter your choice (between 0-5)");
            System.out.println("0:\tExit");
            System.out.println("1:\tCreate list");
            System.out.println("2:\tDisplay list");
            System.out.println("3:\tDisplay failed list");
            System.out.println("4:\tFind topper");
            System.out.println("5:\tSort according to marks");
            choice=sc.nextInt();

            switch (choice) {
                case 0:
                    break;
                case 1:
                    student.create();
                    break;
                case 2:
                    student.displayLinkedList();
                    break;
                case 3:
                    student.displayFailedList();
                    break;
                case 4:
                    student.findTopper();
                    break;
                case 5:
                    student.sort();
                    break;
                default:
                    System.out.println("wrong input");
            }
        }while (choice!=0);
    }
}
