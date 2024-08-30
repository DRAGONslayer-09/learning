package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a12_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();
        System.out.println("Enter B value: ");
        int b = sc.nextInt();
        int x =1;
        /*if (a > b && a%b==0){
            System.out.println("GCD is " + a);
        } else if (b> a && b%a ==0){
            System.out.println("GCD is " + b);
        } else if (a==b){
            System.out.println("GCD is " + a);
        }*/

        for (int i = 1; i<Math.max(a,b);i++) {
            if (a % i == 0 && b % i == 0) {
                x = i;
            }
        }
            System.out.println(x + " is GCD");
    }
}
