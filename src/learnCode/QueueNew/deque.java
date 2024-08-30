package learnCode.QueueNew;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer>deq = new ArrayDeque<>();
        deq.add(15);
        deq.addLast(56);
        deq.add(250);
        deq.addFirst( 50);
        deq.add(23);
        System.out.println(deq);
    }
}
