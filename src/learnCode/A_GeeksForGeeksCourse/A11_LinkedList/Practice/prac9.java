package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

import java.util.LinkedList;

public class prac9 {
    //Deletion of last node
    node head;
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void delLast(){
        if (head == null) return ;
        if (head.next == null) return;
        node secLast = head;
        while(secLast.next.next != null)
            secLast= secLast.next;
        secLast.next = null;
    }
public void add(int data){
        node newnode = new node(data);
        if (head==null){
            head = newnode;
        }else{
            node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }temp.next = newnode;
        }
    }
    public void print(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        prac9 ll = new prac9();
        ll.add(25);
        ll.add(30);
        ll.add(35);
        ll.add(40);
        ll.delLast();
        ll.print();
    }
}
