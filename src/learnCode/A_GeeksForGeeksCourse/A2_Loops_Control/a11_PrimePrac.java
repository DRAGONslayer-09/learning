package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a11_PrimePrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();

        for (int i = 2; i<= Math.sqrt(a); i++){
            if (a%i ==0){
                System.out.println(a + " is not a prime number");
                break;
            }else {
                System.out.println(a + " is a prime number");
                break;
            }
        }
    }
}
