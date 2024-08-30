package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a4_GreatestOfThree {
    public static void main(String[] args) {
        int a, b ,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        a= sc.nextInt();
        System.out.println("Enter Second Value: ");
        b= sc.nextInt();
        System.out.println("Enter Third Value: ");
        c = sc.nextInt();
        int greatest;
        if (a>b && a>c){
             greatest = a;
            System.out.println("Biggest value is " + greatest);
        }
        else if (b>a && b>c){
             greatest = b;
            System.out.println("Biggest value is " + greatest);
        } else if (c >a && c> b){
             greatest = c;
            System.out.println("Biggest value is " +  greatest);
        }
    }
}
