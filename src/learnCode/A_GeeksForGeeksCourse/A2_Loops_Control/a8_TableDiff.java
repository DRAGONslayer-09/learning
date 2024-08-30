package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a8_TableDiff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first value: ");
        int x = sc.nextInt();
        System.out.println("Enter Second value: ");
        int y = sc.nextInt();

        for (int i = 1 ; i<=10; i++){
            int z = x*i;
            int k = y*i;
            System.out.print(z + " ");

            System.out.println(k + " ");

            System.out.println( "The difference table values is " + (z - k));
        }
    }
}
