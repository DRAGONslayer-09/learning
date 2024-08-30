package learnCode.A_GeeksForGeeksCourse.A10_Sorting.Test;

public class Bubble {
    public static void main(String[] args) {
        int [] arr = {12,25,36,15,21};
        bubble(arr);
        print(arr);
    }
    private static void print(int[]arr){
        for (int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void bubble(int[]arr){
        for (int i=0; i< arr.length; i++){
            for (int j = 0; j< arr.length-1;j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
