package learnCode.Stack;

import java.util.Stack;

public class ascendingOrder {
/*    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(13);
        st.push(18);
        st.push(5);
        st.push(22);
        Stack<Integer>tmpStack = new Stack<Integer>();

        while(!st.isEmpty()){
            int tmp = st.pop();
            while(!tmpStack.isEmpty()&& tmpStack.peek()<tmp){
                int.push(tm)
            }
        }
        }
*/
    public static Stack<Integer> sortstack(Stack<Integer>input){
        Stack<Integer> tmp = new Stack<Integer>();
        while(!input.isEmpty()){
            int temp = input.pop();

            while(!tmp.isEmpty() && tmp.peek()<temp){
                input.push(tmp.pop());
            }
            tmp.push(temp);
        }
        return tmp;
    }

}
