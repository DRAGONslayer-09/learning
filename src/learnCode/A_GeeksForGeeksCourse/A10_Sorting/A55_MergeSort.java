package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

import java.util.Arrays;

public class A55_MergeSort {
    static void merge(int[]a,int[]b){
        int []c = new int[a.length+b.length];
        for (int i =0; i<a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }

        for (int k = 0; k<c.length; k++){
            System.out.println(c[k]);
        }
    }

    public static void main(String[] args) {
        int [] x = {10,12,13,15,18};
        int []y = {20,22,26,29};
        merge(x,y);
    }
}
