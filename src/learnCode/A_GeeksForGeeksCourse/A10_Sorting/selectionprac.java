package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class selectionprac {
    public static void main(String[] args) {
        int [] arr= {12,25,24,18,6};
        selectsort(arr);
    }
    private static void selectsort(int[] arr) {
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
