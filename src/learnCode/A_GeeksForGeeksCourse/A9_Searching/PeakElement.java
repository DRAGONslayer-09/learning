package learnCode.A_GeeksForGeeksCourse.A9_Searching;

// Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.
public class PeakElement {
    public static void main(String[] args) {
        int [] arr = {10, 20, 15, 2, 23, 90, 67};
        peak(arr);
    }

    private static void peak(int[] arr) {
        for (int i =0; i< arr.length-1;i++){
            if (arr[i]> arr[i+1] && arr[i]> arr[i-1]){
                System.out.println(arr[i]);
            }
            if (arr[0]>arr[1]){
                System.out.println(arr[0]);
            }
            if (arr[arr.length-1]> arr[arr.length-2]) {
                System.out.println(arr[arr.length - 1]);
            }
        }
    }

}
