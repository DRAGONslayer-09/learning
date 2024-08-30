package learnCode.A_GeeksForGeeksCourse.SortingPractice;

public class bubble {
    public static void main(String[] args) {
        int []arr= {12,24,13,40,26};
        bsort(arr);
        print(arr);
    }

    private static void bsort(int[] arr) {
        for (int i = 0 ; i< arr.length; i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;
                }
            }
        }
    }
    private static void print(int[]arr){
        for (int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }
