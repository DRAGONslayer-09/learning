package learnCode.ConditionalStatements;
import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int Year = sc.nextInt();

        if (Year<=0){
            System.out.println("Not Valid");
        } else if (Year%400 == 0 || Year%4==0 && Year%100!=0){
            System.out.println("It is a leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }
}
