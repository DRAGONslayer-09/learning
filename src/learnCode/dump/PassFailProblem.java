package learnCode.dump;
import java.util.Scanner;
public class PassFailProblem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject 1 marks: ");
        int a = sc.nextInt();
        System.out.println("Enter Subject 2 marks: ");
        int b = sc.nextInt();
        System.out.println("Eneter Subject 3 marks:");
        int c = sc.nextInt();

        int sum = (a+b+c);
        float tot = (sum*100)/300f;
        System.out.println("total: " + tot);
        if (tot<40 && a<33 && b<33 && c<33) {
            System.out.println("You have failed");}
        else {
            System.out.println("You have passed all the subjects");
        }
    }
}
