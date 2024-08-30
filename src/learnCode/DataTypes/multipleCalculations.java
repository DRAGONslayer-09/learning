package learnCode.DataTypes;
import java.util.Scanner;

public class multipleCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x = sc.nextInt();
        System.out.print("Enter second number:");
        int y = sc.nextInt();
        System.out.println("Sum of two inputs = " + (x+y));
        System.out.println("Product of two inputs = " + x*y);
        System.out.println("Average of two inputs = " + (x+y)/2);
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));

    }
}
