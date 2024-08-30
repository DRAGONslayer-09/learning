package learnCode.A_GeeksForGeeksCourse.A3_Arrays_Strings;

import java.util.Scanner;

public class a15_CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int Even = 0;
        int Odd = 0;
        for (int i =1; i<=input; i++){
            if (i%2 == 0){
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println(Even);
        System.out.println(Odd);
    }
}
