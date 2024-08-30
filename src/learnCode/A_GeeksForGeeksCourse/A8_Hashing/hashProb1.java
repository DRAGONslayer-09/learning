package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;
import static java.util.Objects.hash;

public class hashProb1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        System.out.println("Problem 1 create hashmap in different ways");
        System.out.println(hash);
        HashMap<Integer, Integer> hash2 = new HashMap<>(10);
        hash.put("tin" , 5);
        hash.put("pot" , 15);
        hash.put("top" , 25);
        hash.put("can" , 35);
        hash2.put(1 , 25);
        hash2.put(2, 35);


        System.out.println("Problem 2 is Add key value pairs in hash map");
        System.out.println(hash);
        System.out.println();

        System.out.println("Problem 3 is Add key ");
        hash.putIfAbsent("tin", 13);
        hash.putIfAbsent("tap", 18);
        System.out.println(hash);
        System.out.println();

        System.out.println("problem 4 retrieve value from a given key: ");
        System.out.println(hash.get("tap"));
        System.out.println();

        System.out.println("Problem 5 check wether a particular key or value is present in map");
        System.out.println( "Is Tin as key present in map? "+ hash.containsKey("tin"));
        System.out.println("Is 18 as value is present in map? " + hash.containsValue(18));
        System.out.println();

        System.out.println("Problem 6: find out the number of key-value mappings present in a HashMap?");
        System.out.println( "Size of the hashmap"+ hash.size());
        System.out.println();

        System.out.println("problem 7 Remove all the values present in hashmap");
        System.out.println("Size of hashmap before clear: " + hash.size());
        hash2.clear();
        System.out.println("size of hashmap after clear: " + hash2.size());
        System.out.println();

        System.out.println("problem 8 Retrieve all keys");
        System.out.println(hash.keySet());
        String [] arr = hash.keySet().toArray(new String[0]);
        for (int i = 0; i <= arr.length-1;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println("problem 9 Retrive all Values");
        System.out.println(hash.values());
        Integer [] arl = hash.values().toArray(new Integer[0]);
        for (int i =0 ; i <= arl.length-1;i++){
            System.out.println(arl[i]);
        }
        System.out.println();

        System.out.println("Problem 10 retrieve all key value pairs");
        System.out.println(hash);
        System.out.println();

        System.out.println("problem 11 remove a key value pair");
        System.out.println("Before removing : " + hash);
        hash.remove("tap", 18);
        System.out.println("After removing key: tap and value: 18 | " + hash);
        System.out.println();

        System.out.println("problem 12 Replace a value of a certain key");
        hash.replace("pot", 22);
        System.out.println("Replacing Pot value to 22 :" + hash);
        System.out.println();

        System.out.println("problem 13 is similar to problem 12");
        hash.replace("pot", 20, 15 );
        System.out.println("Replacing Pot value from 22 to 15");

        System.out.println("problem 14 How to get synchronized hashMap: ");

    }
}
