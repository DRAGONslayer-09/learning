package learnCode.List;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Merc");

        Iterator<String> x = cars.iterator();
        System.out.println(x.hasNext());
    }
}
