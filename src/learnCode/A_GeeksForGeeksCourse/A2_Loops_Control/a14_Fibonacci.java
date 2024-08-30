package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a14_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int f = sc.nextInt();
        int a = 1, b = 1 , c = 0;
        if(f==1 || f==2){
            System.out.println(f);
        }else {
            System.out.println(a);
            for (int i = 3;i<=f; i++){
                c = a + b;
                a=b;
            //    System.out.println(a);
              //  System.out.println(b);
                b = c;
            }
        }
        System.out.println(c);
    }
}
