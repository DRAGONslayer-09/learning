package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

import java.util.Arrays;

public class A54_InsertionSort {
    static void insert(int[]arr){
        int x = arr.length;
        for (int i =0;i< x;i++){
            int a = arr[i];
            int j = i-1;
            System.out.println("x");
            while(j>=0&&arr[j]>a){
                System.out.println("y");
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = a;
        }
        for (int i = 0 ;i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr = {5,1,3,4,2,9};
        insert(arr);
    }
}
