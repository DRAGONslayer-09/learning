package learnCode.AllinOne;
import java.util.Scanner;
public class SumofTwo {
    public static void main(String[]args){
        int a,b,sum;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number:");
        a = obj.nextInt();
        System.out.print("Enter 2nd number:");
        b = obj.nextInt();
        sum = a+b;
        System.out.println("Sum of two number is " + sum);
    }
}
