package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a13_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number: ");
        int a = sc.nextInt();
        System.out.println("Enter B number: ");
        int b = sc.nextInt();
        int x = Math.max(a,b);
        int y = a * b;
        for(int i = x; i <= y; i++)
        {
            if(i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
