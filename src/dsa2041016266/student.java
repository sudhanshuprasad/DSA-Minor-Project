package dsa2041016266;

import java.util.Scanner;

public class student {
    String name;
    int roll;
    double marks;
    void setStudentDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name roll marks ");
        name=sc.next();
        roll=sc.nextInt();
        marks=sc.nextDouble();
//        sc.close();
    }
    void DisplayStudent(){
        System.out.println("Name \t"+name);
        System.out.println("Roll \t"+roll);
        System.out.println("Marks \t"+marks);
        System.out.println();
    }
}
