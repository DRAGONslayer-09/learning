package learnCode.A_GeeksForGeeksCourse.A12_Stack;


// Implement stack using ll
public class prac1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
     class stack{
        public Node head;

        public void push(int data){
            Node newnode = new Node(data);
            if (head == null){
                head = newnode;
            }
            newnode.next = head;
            head= newnode;
        }
        public int pop(){
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            return head.data;
        }

    }
    public static void main(String[] args) {
        prac1 s = new prac1();
        prac1.stack st = s.new stack();
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println("Top element before pop " + st.peek());
        st.pop();
        System.out.println("Top element after pop " + st.peek());
    }
}
