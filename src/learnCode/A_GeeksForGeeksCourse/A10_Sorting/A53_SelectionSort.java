package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class A53_SelectionSort {
    static void select(int[]arr, int x){
        for (int i=0;i<x;i++){
            int min = i;
            for (int j = i+1 ;j<x;j++){
                if(arr[j] < arr[min]){
                    min =j;
                }
            }
            int k = arr[i];
            arr[i] = arr[min];
            arr[min] = k;
        }
    }

    public static void main(String[] args) {
        int []arr= {3,6,9,1,4};
        select(arr,5);
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
