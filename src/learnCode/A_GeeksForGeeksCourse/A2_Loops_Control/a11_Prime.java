package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a11_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = sc.nextInt();

        for (int i = 2 ; i<= Math.sqrt(x); i++){
            if (x%i == 0){
                System.out.println(x + " is not a prime number");
            } else{
                System.out.println(x + " is a prime number");
            }
        }
    }
}
