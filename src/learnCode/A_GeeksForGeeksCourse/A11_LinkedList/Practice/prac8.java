package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

public class prac8 {
    //Deletion of head in singly Linked list
    static class node{
        int data;
        node next;
        node(int x){
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        node head = new node(10);
        head.next = new node(15);
        head.next.next = new node(20);
        head = del(head);
        print(head);
    }
    static node del(node head){
        if (head== null)return null;
        node newhead = head.next;
        head=null;
        return newhead;
    }
    static void print(node head){
        node x = head;
        while(x!= null){
            System.out.println(x.data);
            x = x.next;
        }
    }
}
