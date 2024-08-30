package learnCode;

import java.util.Scanner;

public class pract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your radius: ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = (radius*radius) * pi;
        double peri = 2 * pi * radius;
        System.out.println(area);
        System.out.println(peri);
    }
}
