package learnCode.A_GeeksForGeeksCourse.A1_Intro;

import java.util.Scanner;

public class a3_SumofNnatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int N = sc.nextInt();
        int up = 0;
        for (int i=1; i<=N ; i++){
            up += i;
        }
        System.out.println(up);
    }
}
