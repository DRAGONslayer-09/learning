package learnCode.StackTotal;
import java.util.Stack;

public class StackMeths {
    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<Integer>();
        stk.push(25);
        stk.push(16);
        stk.push(66);
        stk.push(93);
        System.out.println(stk.search(86));
        System.out.println(stk.capacity());
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        System.out.println(stk.peek());

    }
}
