package learnCode.StackTotal;

import java.util.Stack;

public class ordrring {
    public static void main(String[] args) {
        Stack<Integer> prac = new Stack<Integer>();
        prac.push(16);
        prac.push(20);
        prac.push(69);
        prac.push(52);
        prac.push(36);
        System.out.println("before ordering");
        System.out.println(prac);
        Stack<Integer> ordered  =new Stack<>();
        while(!prac.isEmpty()){
            int var = prac.pop();
            while(!ordered.isEmpty() && ordered.peek() > var){
                prac.push(ordered.pop());
            }
            ordered.push(var);
        }
        System.out.println("ascending order");
        System.out.println(ordered);

        Stack<Integer> descending = new Stack<>();
        int des = ordered.size();
        for(int i = 0 ; i< des; i++){
            descending.push(ordered.pop());
        }
        System.out.println(descending);


    }
}
