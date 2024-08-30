package learnCode.A_GeeksForGeeksCourse.A4_AdvancedTopics;

import java.math.BigInteger;
import java.util.Scanner;

public class A24_PrimeandNextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        BigInteger nextPrime = BigInteger.valueOf(x);
        String z = nextPrime.nextProbablePrime().toString();
        System.out.println(z);
    }
}
