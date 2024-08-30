package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

public class A38_Palindrome {
    static void pal(int x) {
        if (x >= 1) {
            System.out.println(x);
            pal(x - 1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        pal(5);
    }
}
