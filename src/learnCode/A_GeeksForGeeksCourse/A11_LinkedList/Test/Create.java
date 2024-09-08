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
            val.Next = head;
            head.Prev = val;
            head= val;

            /*Node temp = head;
            while(temp.Next != null){
                temp = temp.Next;
            }temp.Next = head;
            head = temp;*/
        }return head;
    }
    public static Node addLast(Node head, int data){
        Node nval = new Node(data);
        if (head== null)
            head = nval;
        else{
            Node temp = head;
            while(temp.Next!= null){
                temp = temp.Next;
            }temp.Next = nval;
            nval.Prev = temp;
        }
        return head;
    }
    public static Node DelF(Node head){
        if (head == null) {
            System.out.println(head);
        } if (head.Next == null)
            return null;
        head = head.Next;
        head.Prev = null;
        return head;
    }
    public static Node DelL(Node head){
        if (head == null)
            return null;
        Node temp = head;
        while(temp.Next!=null){
            temp = temp.Next;
        }temp.Prev.Next = null;
        /*if (temp.Next != null){
            temp.Prev.Next = null;
                head= head.Prev;
        }
        else{
            head =null;
        }*/
        return head;
    }
    public static Node print(Node head){
        if (head == null)
            return null;
        while(head!=null){
            System.out.println(head.data);
            head = head.Next;
        }return head;
    }


    public static void main(String[] args) {
        Node head= null;
        head = addFirst(head,15);
        head= addFirst(head,30);
        head= addLast(head,45);
        head = addLast(head, 60);
        head = DelF(head);
        head = DelL(head);
        print(head);
    }
}
