package learnCode.StackTotal;

import java.util.ArrayList;
import java.util.Stack;

public class Karle {

        ArrayList<Integer> kar = new ArrayList<Integer>();
        public boolean isEmpty(){
            return kar.isEmpty();
        }
         public void push(int data){
             kar.add(data);
             }
             public int pop(){
            if(kar.isEmpty()){
                return -1;
            }else{
                int top = kar.size()-1;
                kar.remove(kar.size()-1);
                return top;

            }
             }
             public int peek(){
            if(kar.isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            } else {
                int top = kar.get(kar.size()-1);
                return top;
            }
             }

    public static void main(String[] args) {
        Karle stack = new Karle();
        stack.push(25);
        stack.push(23);
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
