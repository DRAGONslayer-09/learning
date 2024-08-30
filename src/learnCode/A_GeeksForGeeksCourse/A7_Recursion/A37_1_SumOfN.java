package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

public class A37_1_SumOfN {
    public static int sum(int x){
        if (x<=0){
            return x;
        }
        return x + sum(x-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
