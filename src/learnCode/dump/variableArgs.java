package learnCode.dump;

public class variableArgs {
    static int sum(int...k){
        int result =0;
        for (int a: k){
            result+=a;
        }

        return result;
    }

    public static void main(String[]args){
        System.out.println("Sum of two numbers = " + sum( 2,3));
        System.out.println("Sum of three numbers = " + sum(2,3,8));
        System.out.println("Sum of A big number = " + sum(2,6,12,6954589));
    }
}
