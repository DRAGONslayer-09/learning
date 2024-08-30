package learnCode.A_GeeksForGeeksCourse.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr = {12,24,13,40,28};
        sep(arr,0,arr.length-1);
        print(arr);
    }
    private static void merge(int[]arr,int left , int mid, int right){
        int Llen = mid-left+1;
        int Rlen = right-mid;

        int [] lar = new int [Llen];
        int [] rar = new int[Rlen];

        for (int i = 0; i< Llen;i++){
            lar[i]=arr[left+ i];
        }
        System.out.println(Arrays.toString(lar));
        for (int i = 0 ; i< Rlen;i++){
            rar[i] = arr[mid + 1 + i];
        }
        System.out.println(Arrays.toString(rar));
        int  i = 0 ,j=0;
        int k = left;

        while( i<Llen && j<Rlen){
            if (lar[i]<rar[j]){
                arr[k] = lar[i];
                i++;
            } else{
                arr[k] = rar[j];
                j++;
            }
            k++;
        }
        while(i<Llen){
            arr[k] = lar[i];
            i++;
            k++;
        }
        while(j<Rlen){
            arr[k] = rar[j];
            j++;
            k++;
        }
    }
    private static void sep(int []arr,int left, int right){
        if (left<right){
            int mid = (left+right)/2;

            sep(arr,left,mid);
            //System.out.println("after first sort"+ Arrays.toString(arr));
            sep(arr,mid+1,right);
            //System.out.println("after seconmd sort"+ Arrays.toString(arr));

            merge(arr,left,mid,right);
            //System.out.println("after merge sort"+ Arrays.toString(arr));
        }
    }
    private static void print(int[]arr){
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
