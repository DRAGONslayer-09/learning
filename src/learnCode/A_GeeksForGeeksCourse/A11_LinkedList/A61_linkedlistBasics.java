package learnCode.A_GeeksForGeeksCourse.A11_LinkedList;

import java.util.LinkedList;

public class A61_linkedlistBasics {

    class test{

    }
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(22);
        llist.add(16);
        llist.remove();
        System.out.println(llist.getFirst());
        llist.add(26);
        llist.addFirst(16);
        llist.add(39);
        llist.add(36);
        llist.getFirst();
        llist.getLast();
    }
}
