package learnCode.A_GeeksForGeeksCourse.A4_AdvancedTopics;

import java.util.Scanner;

public class A21_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial num: ");
        int x = sc.nextInt();
        int y =1;
        for (int i = 1  ; i<=x;i++){
            y*=i;
            //System.out.println(y);

        }
        System.out.println(y);
    }
}
