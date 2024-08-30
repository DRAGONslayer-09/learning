package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

class Node1{
    Node1 next;
    int data;
    Node1(int datax){
        data = datax;
        next = null;
    }
}
public class LengthOfLL {
    Node1 head;
    public static int count(Node1 head){
        int count =0;
        Node1 curr = head;
        while(curr!= null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public void add(int x){
        Node1 k = new Node1(x);
        if (head==null) {
            head = k;
        }else{
            Node1 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }temp.next = k;
        }
    }
    public static void main(String[] args) {
        LengthOfLL ll = new LengthOfLL();
        ll.add(22);
        ll.add(26);
        ll.add(55);
        ll.add(33);
        ll.add(30);
        System.out.println(count(ll.head));

    }
}
