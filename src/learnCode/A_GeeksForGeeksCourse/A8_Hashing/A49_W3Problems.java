package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;
import java.util.Hashtable;

public class A49_W3Problems {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("I1", 5);
        hash.put("I2", 15);
        hash.put("I3", 52);
        hash.put("I4", 65);
        HashMap<String, Integer> hash2 = new HashMap<>(hash);
        HashMap<String, Integer> clone = (HashMap<String, Integer>) hash.clone();
        System.out.println(hash2);

    }
}
