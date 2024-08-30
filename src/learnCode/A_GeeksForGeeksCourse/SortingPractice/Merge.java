package learnCode.A_GeeksForGeeksCourse.SortingPractice;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int []arr = {12,24,13,40,28};
        msort(arr,0,arr.length-1);
        print(arr);
    }
    private static void msort(int[]arr, int left, int right){
        if (left<right){
        int mid = (left+right)/2;


        msort(arr,left,mid);
        msort(arr,mid+1,right);
        sep(arr,left,mid,right);
    }
    }
    private static void sep(int[]arr, int left, int mid, int right){
        int ll = mid - left +1;
        int rl = right - mid;

        int[] lar = new int[ll];
        int[]rar = new int[rl];

        for (int i =0; i<ll;i++){
            lar[i] = arr[left+i];
        }
        System.out.println("left"+Arrays.toString(lar));
        for (int j =0 ; j<rl; j++){
            rar[j] = arr[mid+1+j];

        }
        System.out.println("right"+Arrays.toString(rar));
        int a =0, b=0;
        int c = left;
        while(a<ll && b< rl) {
            if (lar[a] < rar[b]) {
                arr[c] = lar[a];
                a++;
            }else{
              arr[c] = rar[b];
              b++;
            }c++;
        }
        while(a<ll){
            arr[c] = lar[a];
            a++;
            c++;
        }
        while(b<rl){
            arr[c] = rar[b];
            b++;
            c++;
        }
    }
    private static void print(int[]arr){
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
