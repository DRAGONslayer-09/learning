package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class bubbletest {
    public static void main(String[] args) {
        int []arr = {13,22,85,41};
        bub(arr);
    }

    private static void bub(int[] arr) {
        for (int i = 0 ; i < arr.length;i++){
            for (int j = 1 ; j< arr.length-1 ; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0 ; k < arr.length; k++){
            System.out.println(arr[k]);
        }
    }
}
