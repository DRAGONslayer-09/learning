package learnCode.dump;
import java.util.Scanner;
public class UserInput {
    public static void main(String[]args){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum + " is the sum of a & b");
    }
}
