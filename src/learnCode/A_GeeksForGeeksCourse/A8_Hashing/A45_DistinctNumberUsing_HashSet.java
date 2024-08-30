package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class A45_DistinctNumberUsing_HashSet {
    static int count(Integer[] arr){
        HashSet<Integer> map = new HashSet<>(Arrays.asList(arr));
        return map.size();
    }
    public static void main(String[] args) {
        Integer [] x = {11,12,13,12,5,10};
        System.out.println(count(x));
    }
}