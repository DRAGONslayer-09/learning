package learnCode.dump;
import java.util.Scanner;
public class PercentProblem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of maths:");
        int a = sc.nextInt();
        System.out.println("Enter marks of Physics:");
        int b = sc.nextInt();
        System.out.println("Enter marks of Botany:");
        int c = sc.nextInt();
        System.out.println("Enter marks of Social Studies:");
        int d = sc.nextInt();
        System.out.println("Enter marks of English:");
        int e = sc.nextInt();

        int sum = a+b+c+d+e;
        int cent = (sum*100/500);
        int result = cent*100;

        System.out.println("The Percentage of Student is:" + cent);

    }
}
