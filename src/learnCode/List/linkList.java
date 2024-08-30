package learnCode.List;
import java.util.Collections;
import java.util.LinkedList;

public class linkList {
        public static void main(String[] args) {
            LinkedList<String> people = new LinkedList<String>();
            people.add("Mirav");
            people.add("Sawan");
            people.add("Suman");
            System.out.println(people);
            people.addFirst("chris");
            System.out.println(people);
            people.removeFirst();
            System.out.println(people);
            System.out.println(people.getFirst());
            System.out.println(people.indexOf("Mirav"));

            Collections.sort(people);

            for(String i : people){
                System.out.println(i);
            }
        }
    }