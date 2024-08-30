package learnCode.dump;

import java.util.Scanner;

public class methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x-y;
        }else{
            z=x+y;
        }
        return z;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int a = sc.nextInt();
        int b = 15;
        int c;
        methods obj = new methods();
        c =obj.logic(a,b);
        c = logic(a,b);
        System.out.println(c);
    }

}
