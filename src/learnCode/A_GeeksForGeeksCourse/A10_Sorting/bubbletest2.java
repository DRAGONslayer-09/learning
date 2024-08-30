package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class bubbletest2 {
    public static void main(String[] args) {
        int [] arr = {12,35,56,8,15};
        bubbles(arr);
    }

    private static void bubbles(int[] arr) {
        for (int i = 0 ; i < arr.length; i++){
            for (int j = 0; j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
