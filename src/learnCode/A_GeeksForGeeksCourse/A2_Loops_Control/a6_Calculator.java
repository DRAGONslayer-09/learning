package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a6_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First value: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Value: ");
        int b = sc.nextInt();

        System.out.println("Enter your number \n1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division: ");
        int  cal = sc.nextInt(5);

        if (cal == 1){
            System.out.println("The value is " +(a+b));
        } else if (cal == 2){
            System.out.println("The value is " + (a-b));
        } else if (cal == 3 ){
            System.out.println("The value is " +(a*b));
        } else{
            System.out.println("The value is " + (a/b));
        }
    }
}
