package learnCode.A_GeeksForGeeksCourse.A5_OOPS;

import java.math.BigInteger;

public class Prac {
    static int A;

    public Prac(int t, int r) {
    }

    /*int x;
    String str;
    char c;
    }
    class main{
        public static void main(String[] args) {
            Prac o = new Prac();
            o.x = 15;
            o.str = "trip";
            System.out.println(o.x);*/
    public static void main(String[] args) {
       /* int value = 3, sum = 6 + -- value;
        int data = --value + ++value/sum++ *value++ ;
        System.out.println(data);
        System.out.println(--value);
       *//*
        int arr[] = {2, 6, 3, 5,9,5,6,1,4,2};

        for (int i = 0; i < arr.length;i++){
            arr[i/2] = arr[arr[arr[i/3]/3]/3];
        }
        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int a = 10, b = 20;
        int c = b;
        b=a;
        a=c;
        System.out.println(b);
        System.out.println(a);
        */

        int x = 100, y = 10;
//        String x = "true";
//        String y = "false";
//        System.out.println(x.equals(y));
        BigInteger B = new BigInteger("100");
        for (int i = 1; i<x; i++){
            B = B.multiply(BigInteger.valueOf(i));
        }
        System.out.println(B);

    }
    }
