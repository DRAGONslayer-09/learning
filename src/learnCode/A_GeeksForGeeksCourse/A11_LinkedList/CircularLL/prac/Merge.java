package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.CircularLL.prac;

public class Merge {
    //Merge two LL in alternate
    public static class Node{
        int data;
        Node Next;
        Node(int data){
            this.data = data;
            Next = null;
        }
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
    public static Node merge(Node head, Node headx){
        if (head == null)
            return null;
        if (headx == null)
            return null;
        Node A = head, B = headx;
        Node nexta, nextb;
        while (A!= null&& B!= null){
            nexta = A.Next;
            nextb = B.Next;

            A.Next = B;
            A = nexta;
            B = nextb;
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
            Node headA = null;
            Node headB = null;
            // Values of Node A
            headA = add(headA,12);
            headA = add(headA,24);
            headA = add(headA,36);
            headA = add(headA,48);
            headA = add(headA,60);
            // Values of Node B
         headB = add(headB,22);
        headB = add(headB,44);
        headB = add(headB,66);
        headB = add(headB,88);
        headB = add(headB, 110);

        print(merge(headA,headB));


    }
}
