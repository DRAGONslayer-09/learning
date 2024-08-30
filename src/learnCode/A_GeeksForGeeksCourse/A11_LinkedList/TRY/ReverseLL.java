package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

import learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice.prac9;

class Node{
    Node next;
    int data;
    Node(int ndata){
        data = ndata;
        next = null;
    }
}
public class ReverseLL {
    Node head;

    static Node rev(Node head){
        Node curr = head, prev = null, next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void print(Node nodex){
        while(nodex != null){
            System.out.println(nodex.data);
            nodex = nodex.next;
        }
    }
    public void add(int x){
        Node k = new Node(x);
        if (head==null) {
            head = k;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }temp.next = k;
        }
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.add(25);
        ll.add(45);
        ll.add(55);
        ll.add(85);
        ll.add(36);
        System.out.println("Original");
        print(ll.head);

        ll.head = rev(ll.head);
        System.out.println("Reverse");
        print(ll.head);
    }
}
