package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class A48_FrequentElement {
    public static void main(String[] args) {
        String x = "TANISHQ CHOPRA";
        char [] c = x.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i =0 ; i<=c.length-1; i++) {
            if (hash.containsKey(c[i])){
                hash.put(c[i],hash.get(c[i])+1);
            }else{
                hash.put(c[i],1);
            }
        }
        System.out.println(hash);
    }
}
