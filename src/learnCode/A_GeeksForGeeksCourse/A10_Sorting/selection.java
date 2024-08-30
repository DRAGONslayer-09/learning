package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class selection {
    public static void main(String[] args) {
        int [] arr= {1,5,3,4,8,6};
        select(arr);
    }

    private static void select(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            int min = i;
            for (int j = i+1; j< arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
