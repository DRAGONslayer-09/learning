package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class selections {
    public static void main(String[] args) {
        int []arr = {10,26,55,23,12};
        selects(arr);
    }

    private static void selects(int[] arr) {
       for (int i = 0 ; i<arr.length; i++){
           int x = i;
           for (int j = i+1; j< arr.length;j++){
               if (arr[j]> arr[x]){
                   x = j;
               }
               int temp = arr[x];
               arr[x] = arr[j];
               arr[j] = temp;
           }
       }
       for (int i =0 ; i < arr.length; i++){
           System.out.println(arr[i]);
       }
    }
}
