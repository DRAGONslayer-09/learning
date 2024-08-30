package learnCode.StackTotal;
import java.util.*;

public class pushLearn {
    public static <obj> void main(String[] args) {
        Queue<Integer> st = new LinkedList<>();
        /*st.push(15);
        st.push(26);
        st.push(56);
        st.push(91);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.search(2);*/
        st.add(15);
        st.add(26);
        st.add(56);
        st.add(91);
        System.out.println(st.peek());

        Vector<Integer> vec = new Vector<Integer>();
        vec.add(25);
        vec.add(0,66);
        vec.add(52);
        int trip = 19;
        vec.add(trip);
        vec.add(33);
        System.out.println(vec.firstElement());
        System.out.println(vec.capacity());
        System.out.println(vec.get(3));

        vec.addAll(st);
        System.out.println(vec);
        vec.add(16);
        vec.add(2);
        vec.add(9);
        System.out.println(vec.capacity());
        vec.ensureCapacity(45);
        vec.add(12);
        vec.add(16);
        vec.add(39);
        vec.add(47);
        System.out.println(vec.capacity());
        System.out.println(vec.clone());
        Object copy_vec = vec.clone();
        System.out.println(vec.containsAll(st));
        System.out.println(vec.elementAt(6));
        System.out.println(vec.isEmpty());
        System.out.println(st.contains(26));
        System.out.println(vec.iterator());
        //System.out.println(vec.remove(1));
        Iterator<Integer> ite = vec.iterator();
        System.out.println(vec + "is vector before iterating");
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        vec.set(3,15);
        System.out.println(vec);
    }
}
