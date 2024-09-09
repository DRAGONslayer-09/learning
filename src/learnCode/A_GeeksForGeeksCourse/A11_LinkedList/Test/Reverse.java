package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Test;

public class Reverse {
    //reverse a singly linked list
    static class Node{
        int value;
        Node Next,Prev;
        Node(int value){
            this.value = value;
            Next = null;
        }
    }
    static Node add(Node head, int value) {
        Node newv = new Node(value);
        if (head == null){
            head = newv;
    }else{
            Node temp = head;
            while(temp.Next != null){
                temp = temp.Next;
            }temp.Next = newv;
        }
        return head;
    }
    static Node rev(Node head){
        if (head == null)
            return head;
        Node tem = null;
        Node last = null;
        Node cur = head;
        while(cur!=null){
            last = cur.Next;
            cur.Next = tem;
            tem = cur;
            cur = last;
        }head= tem;
        return head;
    }

    // For reversal of Doubly linked list
    static Node revDoubly(Node head){
        if (head == null || head.Next == null)
            return null;
        Node prev = head;
        Node curr = head.Next;
        while(curr !=null){
            Node next = curr.Next;
            curr.Next= prev.Next;

            prev = curr;
            curr = next;
        }
        head.Next = null;
        head = prev;
        return head;
    }
    static void print(Node head){
        while(head!=null){
            System.out.println(head.value);
            head = head.Next;
        }
    }
    public static void main(String[] args) {
        Node head =null;
        head = add(head, 13);
        head = add(head, 26);
        head = add(head, 39);
        head = rev(head);
        print(head);
    }
}
