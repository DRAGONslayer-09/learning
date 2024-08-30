package learnCode.Stack;

import java.util.Stack;

public class stck {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(25);
        stack.push(29);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
