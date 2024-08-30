package learnCode.Stack;

import java.util.Stack;

public class stck2main extends revStack{
    public stck2main(int size) {
        super(size);
    }

    public static void main(String[] args) {
        //Stack<Integer> stack =new Stack<Integer>();
        revStack stack = new revStack(4);
        stack.push(25);
        stack.push(16);
        stack.push(99);
        stack.push(33);
        stack.display();
        stack.peek();
        //stack.pop();
        //stack.display();
    }
}
