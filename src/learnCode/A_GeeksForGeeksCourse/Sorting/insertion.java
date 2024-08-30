package learnCode.A_GeeksForGeeksCourse.Sorting;

public class insertion {
    public static void main(String[] args) {
        int [] arr = {12,32,24,13,26};
        ins(arr);
        print(arr);
    }
    private static void print(int []arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
    private static void ins(int[]arr){
        int x = arr.length;
        for (int i = 0 ; i<x;i++){
            int a = arr[i];
            int j = i-1;
            while(j>=0&& arr[j] > a){
                arr[j+1] = j;
                j = j-1;
            }
            arr[j+1] = a;
        }
    }
}
