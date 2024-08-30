package learnCode.A_GeeksForGeeksCourse.A2_Loops_Control;

import java.util.Scanner;

public class a5_WhichYearis_LeapYear {
    public static void main(String[] args) {
        boolean leap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if (year % 4 ==0){
            if (year < 100){
            leap = true;
            }
                if(year % 100 == 0) {
                    if (year % 400 == 0){
                        leap = true;
                    } else{
                        leap = false;
                    }
                }
            }
        System.out.println(leap);
        }
    }
