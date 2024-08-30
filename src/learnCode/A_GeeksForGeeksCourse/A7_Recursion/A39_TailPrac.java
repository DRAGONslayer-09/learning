package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

public class A39_TailPrac {
    static void prac(int x){
        if (x ==0){
            return;
        }
        System.out.println(x);
        prac(x-1);
    }

    public static void main(String[] args) {
        prac(5);
    }
}
