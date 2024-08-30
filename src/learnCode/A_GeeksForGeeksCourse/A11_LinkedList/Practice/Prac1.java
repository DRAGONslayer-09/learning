package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Practice;

public class Prac1 {
    static class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }

    static class Test {
        public static void main(String args[])
        {
            Node head=new Node(10);
            head.next=new Node(20);
            head.next.next=new Node(30);
            head.next.next.next=new Node(40);
            printlist(head);
        }
        public static void printlist(Node head){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
        }
    }
}
