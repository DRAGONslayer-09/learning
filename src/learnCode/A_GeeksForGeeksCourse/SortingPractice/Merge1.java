package learnCode.A_GeeksForGeeksCourse.SortingPractice;

public class Merge1 {
    public static void main(String[] args) {
        int []arr = {12,24,13,40,28};
        msort(arr,0,arr.length-1);
        print(arr);
    }

    private static void print(int[] arr) {
        for (int i =0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void msort(int[] arr, int low, int high) {


    }
    private static void sep(int[]arr,int left,int right){
        int mid = left+(right-left)/2;
        sep(arr,left,mid);
        sep(arr,mid+1,right);
    }
}
