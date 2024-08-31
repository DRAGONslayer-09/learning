package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;
class Node4{
    Node4 next;
    int val;
    Node4(int val){
        this.val = val;
        this.next = null;
    }
}
public class CountOccurinLL {
    static int count(Node4 head, int key) {
        Node4 curr = head;
        int count = 0;
        while (curr != null) {
            if (curr.val == key)
                count++;
            curr = curr.next;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] values = {24, 12, 10, 12, 16, 12, 24, 12};
        Node4 head = new Node4(values[0]);
        Node4 curr = head;
        for (int i = 1; i < values.length; i++) {
            curr.next = new Node4(values[i]);
            curr = curr.next;
        }
        System.out.println(count(head,24));
    }
}