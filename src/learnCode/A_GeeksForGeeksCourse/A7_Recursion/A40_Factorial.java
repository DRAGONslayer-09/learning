package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

import java.util.Scanner;

public class A40_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int x = sc.nextInt();
        int y = 1;
        for (int i = x; i>=1;i--){
            y *= i;
        }
        System.out.println(y);
    }
}
