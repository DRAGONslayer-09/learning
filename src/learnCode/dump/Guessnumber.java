package learnCode.dump;
import java.util.Scanner;
import java.util.Random;

public class Guessnumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int x = ran.nextInt(100);
        System.out.println("Enter you number:");
        int y = sc.nextInt(100);

    }
}
