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
        }
    }
    public static void main(String[] args) {

    }

}
