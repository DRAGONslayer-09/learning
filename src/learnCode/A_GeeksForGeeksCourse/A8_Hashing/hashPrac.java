package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;
import java.util.LinkedList;

public class hashPrac {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sawan",15);
        map.put("tanishq",16);
        System.out.println(map.size());
        System.out.println(map.get("sawan"));
        System.out.println(map.containsKey(2));
        System.out.println(map.keySet());
        System.out.println(map.values());




    }
}
