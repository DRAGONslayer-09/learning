package learnCode.A_GeeksForGeeksCourse.A4_AdvancedTopics;

import java.math.BigInteger;

public class A22_BigFactorial {
    public static void main(String[] args) {
        int x = 10;
        BigInteger y = new BigInteger("1");
        for(int i=1;i<=x;i++){
            y = y.multiply(BigInteger.valueOf(i));
            System.out.println(y);
        }
        System.out.println(y);
    }
}
