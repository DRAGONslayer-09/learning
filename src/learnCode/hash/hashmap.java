package learnCode.hash;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> Capital = new HashMap<String, String>();

        Capital.put("India", "Delhi");
        Capital.put("US", "Washinton");
        Capital.put("China", "Beijing");
        System.out.println(Capital.get("India"));

        Capital.remove("US");
        System.out.println(Capital);
        System.out.println(Capital.containsValue("India"));

    }
}
