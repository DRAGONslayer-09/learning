package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class bubble {
    public static void main(String[] args) {
        int []arr = {5,1,4,2,8,9};
        bsort(arr);
    }

    private static void bsort(int[] arr) {
        for(int i =0; i< arr.length; i++){
            for (int j=i;j<arr.length-i-1;j++){
                if(arr[j]> arr[j+1]){
                    int f = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = f;
                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
