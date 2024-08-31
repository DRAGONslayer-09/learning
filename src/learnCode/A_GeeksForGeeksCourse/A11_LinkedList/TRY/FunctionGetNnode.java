package learnCode.A_GeeksForGeeksCourse.A11_LinkedList.TRY;

class Node2{
    Node2 next;
    int data;
    Node2(int d){
        data = d;
        next = null;
    }
}
public class FunctionGetNnode{
    Node2 head;
    public void add(int x){
        Node2 a = new Node2(x);
        if (head == null){
            head = a;
    }else{
            Node2 temp = head;
            while(temp.next!=null){
                //  System.out.println(temp.data);
                temp =temp.next;
            }
            temp.next = a;
        }
    }
    static int node(Node2 head, int index){
        if (head== null)
            return -1;
        if (index == 1){
            return head.data;
        }
        return node(head.next, index-1);
    }
    public static void main(String[] args) {
       FunctionGetNnode tip = new FunctionGetNnode();
       tip.add(15);
       tip.add(20);
        tip.add(25);
        tip.add(30);
        tip.add(35);
        System.out.println(node(tip.head, 2));
    }
}
