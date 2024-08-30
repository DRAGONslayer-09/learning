package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

import java.util.Scanner;

public class A42_SumOfDigits {
        public static int fun(int x){
            if (x <= 0)
                return 0;
            return x%10 + fun(x/10);
        }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
            int y = fun(sc.nextInt());
        System.out.println(y);

    }
}
