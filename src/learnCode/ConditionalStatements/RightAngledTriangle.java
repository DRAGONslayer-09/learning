package learnCode.ConditionalStatements;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();

        for (int i =1; i<=6;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
