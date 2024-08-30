package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

import java.util.LinkedList;

public class TraverseThroughLL {
    static class node {
        int data;
        node next;
        node(int x){
            this.data = x;
            next = null;
        }
    }
    public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<>();
            node head = new node(5);
            head.next = new node(15);
            head.next.next = new node(20);
        head.next.next.next  = new node(10);
            print(head);
        }
    public static void print(node head){
        node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
