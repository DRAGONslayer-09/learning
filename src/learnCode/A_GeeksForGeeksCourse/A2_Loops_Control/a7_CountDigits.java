package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a7_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int value = sc.nextInt();
        int count =0;
        int x =value;
        while (x!=0){
            x = x/10;
            count++;
        }
        System.out.println(count);
    }
}
