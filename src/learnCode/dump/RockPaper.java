package learnCode.dump;
import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[]args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor, \n Your number:");
        int x = sc.nextInt(3);

        int z = ran.nextInt(3);
        System.out.println("Coumputer Choice:" + z);
        if( x == z){
            System.out.println("Draw");
        }else if (x == 0 && z==1 || x == 1 && z ==2 || x==2 && z==0){
            System.out.println("Computer Wins");
        } else if (x == 1 && z==0 || x == 2 && z ==1 || x==0 && z==2){
            System.out.println("You Win");
        }

    }
    }
