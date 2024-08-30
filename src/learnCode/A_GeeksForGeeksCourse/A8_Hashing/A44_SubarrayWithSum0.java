package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

import java.util.HashSet;

public class A44_SubarrayWithSum0 {
    static boolean find(int[] x){
        HashSet<Integer> has = new HashSet<>();
        int pre= 0;
        for (int i =0; i<=x.length-1;i++){
            pre+=x[i];
            /*if (has.contains(pre)){
                return true;
            }*/
            if (pre == 0){
                return true;
            }
            has.add(pre);
            }
        return false;
        }

    public static void main(String[] args) {
     int [] arr  = {1,-3,2,4,5};
        System.out.println(find(arr));
    }
    }
