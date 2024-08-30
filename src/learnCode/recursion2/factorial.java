package learnCode.recursion2;

import java.util.Scanner;

public class factorial {
    public static int fact(int f){
        if (f == 0){
            return 1;
        }
        return f *fact(f-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int value = sc.nextInt();
        System.out.println(fact(value));
        }

    }