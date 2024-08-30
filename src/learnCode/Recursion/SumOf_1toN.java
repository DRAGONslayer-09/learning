package learnCode.Recursion;

public class SumOf_1toN {
    public static int sum(int s){
        if (s==0){
            return 0;
        }
        return s + sum(s-1);
    }

    public static void main(String[] args) {
        int n = 7;
        int tot = sum(n);
        System.out.println(tot);
    }
}
