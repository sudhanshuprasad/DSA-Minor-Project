package dsa2041016266;

import java.util.Scanner;

public class SinglyLinkedList {
    static node start=null;
//    static node q=new node();
    void create() {
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            node newNode=new node();
            newNode.stud=new student();
            newNode.stud.setStudentDetail();
            newNode.next=null;
            if(start==null){
                start=newNode;
            }else {
                node temp=start;
                while (temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
//            q=p;

            System.out.println("create more?(y/n)");
            ch=sc.next().charAt(0);
        }while (ch=='y'||ch=='Y');
//        sc.close();
    }

    void displayLinkedList(){
        node s=start;
        while (s!=null){
            s.stud.DisplayStudent();
            s=s.next;
        }
    }

    void findTopper(){
        node s=start;
        student t=new student();
        t=s.stud;

        while (s!=null){
            if(s.stud.marks>t.marks){
                t.marks=s.stud.marks;
            }
            s=s.next;
        }
        t.DisplayStudent();
    }

    void displayFailedList(){
        node s=start;
//        student t=s.stud;
        while (s!=null){
            if (s.stud.marks<40){
                s.stud.DisplayStudent();
                System.out.println("\n");
            }
            s=s.next;
        }
    }

    void sort(){
        node i, j;
        i=start;
        while (i.next!=null){
            j=i.next;
            while (j!=null){
                if (i.stud.marks<j.stud.marks) {
                    student temp = new student();
                    temp = i.stud;
                    i.stud = j.stud;
                    j.stud = temp;
                }
                j=j.next;
            }
            i=i.next;
        }
    }

}
