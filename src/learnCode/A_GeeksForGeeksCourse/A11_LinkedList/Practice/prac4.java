package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

import learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY.TraverseThroughLL;

import java.util.LinkedList;

public class prac4 {
    // DELETION IN SINGLY LINKED LIST
        node head;

        static class node {
            int data;
            node next;
            node(int d) {
                data = d;
                next = null;
            }
        }

        void delnode(int position) {
            if (head == null)
                return;

            node temp = head;
            if (position == 0) {
                head = temp.next;
                return;
            }
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null || temp.next == null)
                return;
            node next = temp.next.next;
            temp.next = next;
        }
        void print(){
            node t = head;
            while (t != null) {
                System.out.println(t.data);
                t = t.next;
            }
        }

    public static void main(String[] args) {
        prac4 ll = new prac4();

        ll.head = new node(12);
        ll.head.next = new node(15);
        ll.head.next.next = new node(20);
        ll.head.next.next.next  = new node(10);

        ll.print();
        ll.delnode(2);
        System.out.println(" After deletion");
        ll.print();
    }
    }