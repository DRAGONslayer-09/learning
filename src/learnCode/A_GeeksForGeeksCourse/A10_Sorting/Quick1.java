package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class Quick1 {
    public static void main(String[] args) {
        int []arr = {12,51,41,25,32};
        qsort(arr, 0, arr.length-1);
        print(arr);
    }
    private static void print(int []arr){
        for (int i =0 ; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static int partition(int []arr, int low, int high){
        int pivot = arr[high];
        int l = low;

        for (int i =low;i< high;i++){
            if (arr[i]<pivot){
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l++;
            }
        }
        int temp = arr[l];
        arr[l] = arr[high];
        arr[high] = temp;
        return l;
    }
    private static void qsort(int[] arr, int low, int high) {
        if (low<high){
            int piv = partition(arr,low,high);

            qsort(arr,low,piv -1);
            qsort(arr,piv+1,high);
        }
    }
}
