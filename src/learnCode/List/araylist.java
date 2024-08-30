package learnCode.List;
import java.util.ArrayList;
public class araylist {
    public static void main(String[] args) {
        ArrayList<String> bikes = new ArrayList<>();
        bikes.add("BMW");
        bikes.add("KTM");
        bikes.add("Aprilia");
        System.out.println(bikes);
        bikes.add(1,"Suzuki");
        System.out.println(bikes);
        bikes.get(2);
        System.out.println(bikes.get(2));
        bikes.remove(2);
        System.out.println(bikes);
       // bikes.clear();
            }
}
