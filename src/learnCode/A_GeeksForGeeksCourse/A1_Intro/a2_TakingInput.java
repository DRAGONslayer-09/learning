package learnCode.A_GeeksForGeeksCourse.A1_Intro;

import java.util.Scanner;

public class a2_TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        byte c = sc.nextByte();
        String s  = sc.next();
        //String s = sc.nextLine();  //this command is copied
        //1
        // String s = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        }
    }
