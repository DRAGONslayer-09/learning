package learnCode.dump;

public class recursions {
    /* static int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
    public static void main(String[]args){
        int x = 5;
        System.out.println("Factorial of 5: " + fact(x));
        }*/
    public static void main(String[]args) {
        int z = 1;
        for (int i = 1; i <= 5; i++) {
            z = i * z;

        }
        System.out.println(z);
    }
}
