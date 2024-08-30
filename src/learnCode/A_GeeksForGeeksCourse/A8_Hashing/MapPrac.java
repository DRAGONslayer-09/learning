package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;

public class MapPrac{
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0,15);
        hash.put(1,25);
        hash.put(3,25);
        System.out.println(hash);
        System.out.println(hash.get(1));
        hash.remove(2);
        System.out.println(hash.size());
        hash.forEach((key,value)->{
                    System.out.println(key + " " +value);
                });
        System.out.println(hash.containsKey(2));

        HashMap<Object, Integer> obj = new HashMap<>();
        obj.put(1 , 60);
        obj.put("two", 61);

        System.out.println(hash.values());
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        System.out.println(hash.containsValue(25));
        System.out.println(hash.size());
        HashMap<Integer, Integer> hashc = (HashMap<Integer, Integer>) hash.clone();
        hashc.put(2,35);
        System.out.println("Clone of first hash map and added an eelement " + hashc);
        System.out.println(hash.entrySet());
        hash.equals(hashc);

    }
}
