package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

import java.util.LinkedList;

public class prac6 {
    pode head;
    // Traverse through LL
    public static void main(String[] args) {
        prac6 llist= new prac6();
        llist.head = new pode(12);
        pode sec = new pode(24);
        pode third = new pode(36);

        llist.head.next  = sec;
        sec.next = third;
        llist.print();
    }
    static class pode{
        int data;
        pode next;
        pode(int x){
            this.data = x;
            next = null;
        }
    }
    public void print(){
        pode  a = head;
        while(a!= null){
            System.out.println(a.data);
            a= a.next;
        }
    }
}
