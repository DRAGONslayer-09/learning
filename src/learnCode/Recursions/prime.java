package learnCode.Recursions;
import java.util.Scanner;
public class prime {
   /* public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int Num = sc.nextInt();

        if(Num<=1){
            System.out.println("This is not prime");
        } else if(Num == 2){
            System.out.println("This is Prime");
        } else if (Num%2==0){
            System.out.println("This is not a prime Number");
        }
        for(int i =3; i<=Math.sqrt(Num); i+=2){
            if(Num%i == 0){
                System.out.println("This is not prime");
            }else {
                System.out.println("This is a prime");
            }
            }
        } */
        public static void main(String[]args){
        for (int i =1 ; i<=100 ; i++){
            for(int z = 1; z<=i; z++){
                if(z%i==0){
                    System.out.println(z);
                }
                }
            }
        }
    }
