package learnCode.ConditionalStatements;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n ; i++) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("The total of first " + n + " numbers is " + sum);
    }
}
