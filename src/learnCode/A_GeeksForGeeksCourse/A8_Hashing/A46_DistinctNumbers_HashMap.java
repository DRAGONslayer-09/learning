package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashMap;

public class A46_DistinctNumbers_HashMap {
    public static void main(String[] args) {
        Integer [] arr = {11,12,13,12,5,10};
        HashMap<Integer, Integer> val = new HashMap<>();
        for (int i =0;i< arr.length;i++){
            if(val.containsKey(arr[i])){
            }else{
              val.put(arr[i],0);
            }
        }
        System.out.println(val.size());


    }
}
