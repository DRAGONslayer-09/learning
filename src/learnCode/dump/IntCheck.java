package learnCode.dump;
import java.util.Scanner;
public class IntCheck {
    public static void main(String[]args){
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
