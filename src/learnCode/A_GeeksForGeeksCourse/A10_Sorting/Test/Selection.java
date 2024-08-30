package learnCode.A_GeeksForGeeksCourse.A10_Sorting.Test;

public class Selection {
    public static void main(String[] args) {
        int [] arr = {12,26,43,13,23};
        select(arr);
        print(arr);
    }
    private static void print(int [] arr){
        for (int  i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void select(int[]arr){
        for (int i = 0 ; i< arr.length; i++){
            int low = i;
            for (int j = i+ 1 ; j< arr.length ;j++) {
                if (arr[low] > arr[j]){
                    low = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
        }
    }
}
