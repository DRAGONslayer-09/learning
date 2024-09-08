package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Test;

public class ReverseDoubly {
    static class Node{
        int data;
        Node Next,Prev;

        Node(int data) {
            this.data = data;
            Next = Prev = null;
        }
    }
    public static Node reve(Node head){
        if (head == null)
            return null;
        Node temp = head.Prev;
        head.Prev = head.Next;
        head.Next = temp;
        if (head.Prev == null){
            return head;
        }
        return reve(head.Prev);
    }
    public static Node add(Node head, int val){
        Node newval = new Node(val);
        if(head == null){
            head = newval;
        }else{
            Node temp = head;
            while(temp.Next!=null){
                temp = temp.Next;
            }temp.Next = newval;
            newval.Prev = temp;
        }return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.Next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = add(head, 15);
        head= add(head, 30);
        head = add(head,45);
        head = add(head, 60);
        System.out.println("Before Rev");
        print(head);
        System.out.println("After Rev");
        //System.out.println(head = head.Prev);
        head = reve(head);
        print(head);

    }
}
