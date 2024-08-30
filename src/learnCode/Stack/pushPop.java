package learnCode.Stack;

import java.util.Stack;

public class pushPop {
    public static void main(String[] args) {
        Stack<Integer> store = new Stack<>();
        store.push(25);
        store.push(50);
        store.push(75);
        store.push(100);
        System.out.println(store.pop());
        System.out.println(store.pop());

        while(!store.isEmpty()){
            System.out.println(store.pop()
            );
        }
    }
}
