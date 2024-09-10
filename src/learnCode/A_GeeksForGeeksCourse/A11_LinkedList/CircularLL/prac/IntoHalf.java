package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.CircularLL.prac;

public class IntoHalf {
    //Cut Circular ll into two
    public static class Node{
        Node Next;
        int data;
        Node(int data){
        this.data = data;
        Next = null;
        }
    }
    static Node splitList(Node head) {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return null;
        }
        while (fast.Next!= head &&
                fast.Next.Next!= head) {
            fast = fast.Next.Next;
            slow = slow.Next;
        }
        if (fast.Next.Next == head) {
            fast = fast.Next;
        }
        fast.Next = slow.Next;
        slow.Next = head;

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
        head = add(head, 18);
        head = add(head, 36);
        head = add(head, 54);
        head = add(head, 72);
        splitList(head);
    }
}
