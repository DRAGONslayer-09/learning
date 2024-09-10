package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.CircularLL.prac;

public class CheckCircular {
    // Check whether a Linked List is Circular or Not
    static class Node{
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            Next = null;
        }
    }
    public static Boolean isCircular(Node head) {
        if (head == null)
            return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != head){
            slow = slow.Next;
            fast = fast.Next.Next;
            if (slow == fast)
            return true;
    }
        return false;
    }
    public static Node add(Node head, int value) {
        Node nv = new Node(value);
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
        head = add(head,15);
        head = add(head,30);
        head = add(head,45);
        head = add(head,15);
        System.out.println(isCircular(head));
        print(head);
    }
}
