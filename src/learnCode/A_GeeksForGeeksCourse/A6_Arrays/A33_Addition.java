package learnCode.A_GeeksForGeeksCourse.A6_Arrays;
import java.util.Arrays;

public class A33_Addition {
    public static void main(String[] args) {
        int[] ad = new int[]{15,59,25,45};
        int [] ad2 = new int[ad.length+1];
        for (int i = 0, k=0; i<ad.length;i++){
            ad2[k] = ad[i];
            k++;
        }
        ad2 [4]= 86;
        for (int x : ad2){
            System.out.println(x);
        }
    }
}
