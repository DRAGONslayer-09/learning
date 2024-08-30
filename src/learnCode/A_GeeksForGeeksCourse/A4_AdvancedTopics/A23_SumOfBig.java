package learnCode.A_GeeksForGeeksCourse.A4_AdvancedTopics;

import java.math.BigInteger;

public class A23_SumOfBig {
    public static void main(String[] args) {
        String x = "159856525680";
        String y = "849712781276";

        BigInteger num1 = new BigInteger(x);
        BigInteger num2 = new BigInteger(y);
        BigInteger tots = num1.add(num2);
        System.out.println(tots);
        }
    }
