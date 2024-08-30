package learnCode.ConditionalStatements;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a desired number: ");
        int x = sc.nextInt();

        if(x>0){
            System.out.println("Given number " + x +" is Positive ");
        } else {
            System.out.println("Given number " + x +" is Negative");
        }
    }
}
