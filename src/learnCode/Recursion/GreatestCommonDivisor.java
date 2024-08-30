package learnCode.Recursion;

public class GreatestCommonDivisor {
    public static int GCD(int num1, int num2){
        if (num1==0 && num2>0){
            return num2;
        }
        if (num2==0&& num1>0){
            return num1;
        }
        int remainder = num1%num2;
        return GCD(num2,remainder);
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 20;
        int gcd = GCD(num1,num2);
        System.out.println("The Greatest Common Divisor of " +num1+ " & "+ num2+ " is "+gcd);
    }
}
