package learnCode.A_GeeksForGeeksCourse.A6_Arrays;

public class A31_SortArray {
    public static void main(String[] args) {
        int arr [] = {5,9,6,2,4,8,3};
        for (int i= 0 ; i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        for (int t =0; t< arr.length;t++){
            System.out.println(arr[t]);
        }
    }
}
