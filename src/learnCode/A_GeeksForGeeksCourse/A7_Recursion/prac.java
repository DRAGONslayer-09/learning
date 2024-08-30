package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

import java.util.Scanner;

public class prac {
    static int pieces(int x, int a , int b, int c){
        if (x == 0)
            return 0;
        if (x<=1)
            return -1;

        System.out.println(x);

        int func = Math.max(pieces(x-a,a,b,c),
                Math.max(pieces(x-b,a,b,c),pieces(x-c,a,b,c)));

        if (func == -1)
            return -1;
        return func+1;
    }
    public static void main(String[] args) {
        System.out.println(pieces(23,9,11,2));

    }
}
