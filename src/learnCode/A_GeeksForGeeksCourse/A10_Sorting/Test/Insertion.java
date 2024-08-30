package learnCode.A_GeeksForGeeksCourse.A10_Sorting.Test;

public class Insertion {
    public static void main(String[] args) {
        int [] arr = {12,25,13,24,15};
        insert(arr);
        print(arr);
    }
    private static void print(int [] arr){
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void insert(int[]arr){
        for (int i = 1 ; i < arr.length; i++){
            int x = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>x){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }
    }
}
