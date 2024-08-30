package learnCode.A_GeeksForGeeksCourse.A6_Arrays;

import java.util.Arrays;

public class A30_LargestNumberInArray {
    public static void main(String[] args) {
        int  ar[] = {1, 7, 3, 5, 6, 8, 12};
        Arrays.sort(ar);
        int top = ar[ar.length-1];
        System.out.println(top);

    }
}
