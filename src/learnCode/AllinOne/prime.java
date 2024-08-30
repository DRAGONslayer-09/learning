package learnCode.AllinOne;

public class prime {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i<=10; i++){
            if (n%i==0){
                System.out.println(n + " is not prime");
            }
        }
    }
}