package learnCode.A_GeeksForGeeksCourse.A3_Arrays_Strings;

import java.util.Scanner;

public class a16_CountUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(11);
       int [] nums = new int[x];
        int Even =0;
        int Odd = 0;
        nums =new int[] {1, 2, 3, 4, 8};
        for (int i=0; i<= nums.length-1;i++){
            if (nums[i] % 2 ==0){
                Even++;
            }else{
                Odd++;
            }
        }
        System.out.println(Even);
    }
}
