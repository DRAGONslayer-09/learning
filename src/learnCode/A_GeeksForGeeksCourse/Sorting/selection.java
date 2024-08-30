package learnCode.A_GeeksForGeeksCourse.Sorting;

public class selection {
    public static void main(String[] args) {
        int[] arr = {12, 23, 10, 15, 25, 11};
        select(arr);
        print(arr); }
    private static void select(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                    int temp = arr[small];
                    arr[small] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }
    private static void print(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}