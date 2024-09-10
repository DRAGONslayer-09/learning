package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.CircularLL.prac;

public class Convert {
    // Convert singly to circular LL
    public static class Node {
        Node Next;
        int data;

        Node(int data) {
            this.data = data;
            Next = null;
        }
    }
    public static Node turn(Node head){
        if ( head == null)
            return null;
        Node temp =head;
        while (temp.Next!= null)
            temp = temp.Next;
        temp.Next = head;
        return head;
    }
    public static Node add(Node head, int data) {
        Node nv = new Node(data);
        if (head == null){
            head = nv;
        }else {
            Node tem = head;
            while (tem.Next != null) {
                tem = tem.Next;
            }tem.Next = nv;
        }
        return head;
    }
    public static Node print(Node head) {
        Node temp = head;
        if (temp == null)
            return head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.Next;
        }return head;
    }

    public static void main(String[] args) {
        Node head = null;
        head= add(head,19);
        head= add(head,38);
        head= add(head,57);
        head= add(head,76);
        head = turn(head);
        print(head);


    }
}
