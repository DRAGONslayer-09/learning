package learnCode.dump;
import java.util.Scanner;
public class KMtoMiles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float kms = sc.nextFloat();
        float mil = 0.621371f;
        float con = kms * mil;
        System.out.println("Converted to miles = " + con);
    }
}
