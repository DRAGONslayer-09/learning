package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

class Node3{
    int data;
    Node3 next;
    Node3(int d){
        this.data = d;
        this.next = null;
    }
}
public class findMidElement {
    static int length(Node3 head){
        int length =0;
        while(head!=null){
            length++;
            head= head.next;
        }
        return length;
    }
    static int getMid(Node3 head){
        int length = length(head);
        int mid = length/2;
        while(mid >0){
            head = head.next;
            mid--;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node3 head = new Node3(22);
        head.next = new Node3(24);
        head.next.next = new Node3(44);
        head.next.next.next = new Node3(88);
        head.next.next.next.next = new Node3(88);
        System.out.println(getMid(head));
    }
}

