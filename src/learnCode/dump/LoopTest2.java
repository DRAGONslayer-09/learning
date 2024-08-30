package learnCode.dump;

public class LoopTest2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2 * i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
    }
}