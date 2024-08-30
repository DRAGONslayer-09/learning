package learnCode.A_GeeksForGeeksCourse.A4_AdvancedTopics;

import java.math.BigInteger;

public class A24_z {
    public static boolean isPrime(int x){
        BigInteger b = BigInteger.valueOf(x);
        return b.isProbablePrime(1);
    }
}
