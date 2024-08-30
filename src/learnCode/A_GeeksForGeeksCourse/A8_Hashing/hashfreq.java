package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;

public class hashfreq {
    public static void main(String[] args) {
        String name = "TANISHQ CHOPRA SAWAN MIRAV CHIRAG SUMAN";
        char [] con = name.toCharArray();
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0 ; i <= con.length-1; i++){
            if (hash.containsKey(con[i])){
                hash.put(con[i],hash.get(con[i])+1);
            }else{
                hash.put(con[i],1);
            }
        }

        hash.remove(' ');
        System.out.println(hash);
        }
    }

