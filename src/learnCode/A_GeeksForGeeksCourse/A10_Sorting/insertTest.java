package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class insertTest {
    public static void main(String[] args) {
        int []arr = {15,23,18,29,65};
        inst(arr);
    }

    private static void inst(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j]>x){
                arr[j+1] = arr[j];
            }
            arr[j+1] = x;
        }
    }
}
