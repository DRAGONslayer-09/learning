package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int [] arr =  {12,32,45,85,65,24,7};
        merg(arr,0,arr.length-1);
        /*System.out.println(arr.length);
        int mid = arr.length/2;
        int [] arr1 = Arrays.copyOfRange(arr,0,mid);
        int []arr2 = Arrays.copyOfRange(arr, mid,arr.length);
        for (int i =0; i <arr1.length; i++){
            System.out.println(arr1[i] + " a1");
        }
        System.out.println("--------------------");
        for (int i = 0; i< arr2.length;i++){
            System.out.println(arr2[i]);
        }

       */
        print(arr);
    }

    private static void print(int[] arr) {
        for (int x = 0 ; x <arr.length; x++){
            System.out.println(arr[x]);
        }
    }

    private static void merg(int[] arr, int Left, int Right) {
        if (Left < Right) {
            int Mid = (Left + Right) / 2;
            merg(arr, Left, Mid);
            merg(arr, Mid + 1, Right);

            merg1(arr, Left, Mid, Right);
        }
    }
    private static void merg1(int[]arr,int Left, int Mid,int Right){
        int l = Mid - Left+1;
        int r = Right - Mid;

        int [] left = new int[l];
        int []right = new int[r];

        for (int i =0; i< left.length;i++){
            left[i] = arr[Left +1];
            System.out.println(left[i]);
        }
        for (int j = 0 ; j <right.length;j++){
            right[j] = arr[Mid+1+ j];
        }
        int i = 0, j =0;
        int k = l;
        while (i< l && j< r){
            if (left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
    }

}
