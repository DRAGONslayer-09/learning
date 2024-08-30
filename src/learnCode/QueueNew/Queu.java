package learnCode.QueueNew;
import java.util.*;

public class Queu {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(32);
        que.add(45);
        que.add(56);
        que.add(25);
        System.out.println(que.peek());
        //System.out.println(que.remove());
       // System.out.println(que.peek());
        //System.out.println(que);

        Stack<Integer> newst = new Stack<>();
        //Sort a queue

        /*List<Integer> order = new LinkedList<Integer>(que);
        Collections.sort(order);
        System.out.println(order);         //Without using collections
        */

        /*Queue<Integer> NewQue = new LinkedList<>();

        while(!que.isEmpty()){
            int var = que.remove();
            while(!NewQue.isEmpty() && NewQue.peek() > var){
                que.add(NewQue.remove());
            }
            NewQue.add(var);
        }
        System.out.println(NewQue);*/


//reverse a queue

        /*Deque<Integer> deq = new ArrayDeque<>();
        int size = que.size();
        for (int i = 0; i<size; i++){
            deq.addFirst(que.remove());
        }
        System.out.println(deq);*/

// swap position with next element in list
        Queue<Integer>que2 = new LinkedList<>();
        int size = que.size();
        for(int i = 0;i<size/2;i++) {
            System.out.println(que);
            int x = que.remove();
            System.out.println(x);
            que2.add(que.remove());
            que2.add(x);
            /*System.out.println(que2);
            if (!que.isEmpty()) {
                System.out.println("if");
                que2.add(que.remove());
                System.out.println(que2);
        }*/
    }

        System.out.println(que2);
    }
}
