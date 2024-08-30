package learnCode.Stack;

import java.util.Stack;

public class AscendingDriver extends ascendingOrder {
    public static void main(String[] args) {
        Stack<Integer>input = new Stack<Integer>();
        input.push(25);
        input.push(15);
        input.push(20);
        input.push(40);

        Stack<Integer> tmp=sortstack(input);
        System.out.println("Sorted: ");
        while (!tmp.isEmpty()){
            System.out.println(tmp.pop() + " ");
        }
    }


}
