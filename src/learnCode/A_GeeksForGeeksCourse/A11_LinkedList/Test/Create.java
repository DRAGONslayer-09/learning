package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.Test;

public class Create {
    //Add and remove elements at first last and in the desired place
    static class Node {
        int data;
        Node Next,Prev;
        Node(int data){
            this.data = data;
            Next = Prev = null;
        }
    }
    public static Node addFirst(Node head, int data){
        Node val = new Node(data);
        if (head==null)
            head = val;
        else {
            Node temp = head;
            while(temp.Next != null){
                temp = temp.Next;
            }temp.Next = head;
            head = temp;
        }return head;
    }
    public static void addLast(Node head, int data){
        Node nval = new Node(data);
        if (head== null)
            head = nval;
        else{
            Node temp = head;
            while(temp.Next!= null){
                temp = temp.Next;
            }temp.Next = nval;
        }
    }
    public static Node DelF(Node head){
        if (head == null) {
            System.out.println(head);
        } return head.Next;
    }
    public static Node DelL(Node head){
        if (head == null)
            return null;
        Node temp = head;
        while(temp.Next!=null){
            temp = temp.Next;
        }
        if (temp.Prev != null){
            temp.Prev.Next = null;
                //head= head.Prev;
        }else{
            head =null;
        }
        return head;
    }
    public static Node print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.Next;
        }return head;
    }


    public static void main(String[] args) {
        Node head= null;
        head = addFirst(head,15);
        addFirst(head,30);
        addLast(head,45);
        addLast(head, 60);
        head = DelF(head);
        head = DelL(head);
        print(head);
    }
}
