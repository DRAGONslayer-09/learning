package learnCode.StackTotal;
import java.util.Queue;
import java.util.LinkedList;

public class QueueMeths {
    public static void main(String[] args) {
        Queue<Integer> gret = new LinkedList<Integer>();

        gret.add(15);
        gret.add(66);
        gret.add(98);
        gret.add(12);
        gret.add(66);
        System.out.println(gret.contains(3));
        System.out.println(gret.peek());
        System.out.println(gret.size());
        System.out.println(gret.getClass());
        System.out.println(gret.offer(12));
        System.out.println(gret);
        System.out.println(gret.hashCode());
    }
}
