package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

public class A37_Print1toN {
    static void print(int x){
        if (x>0){
            System.out.println(x);
            print(x-1);
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
