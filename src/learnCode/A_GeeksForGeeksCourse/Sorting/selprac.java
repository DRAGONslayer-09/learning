package learnCode.A_GeeksForGeeksCourse.Sorting;

public class selprac {
    public static void main(String[] args) {
        int []arr = {12,35,10,22,26};
        sel(arr);
        prac(arr);
    }
    private static void prac(int []arr){
        for (int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void sel(int []arr){
        for (int i =0 ; i<arr.length-1;i++) {
            int min = i;
            for (int j = i+1;j < arr.length; j++){
                if (arr[j] < arr[min] ){
                min = j;
            }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
