package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class insertion2 {
    public static void main(String[] args) {
        int [] arr = {11,25,64,20,19};
        inss(arr);
    }
    private static void inss(int[] arr) {
        int len  = arr.length;
        for (int i = 1 ; i < len; i++){
            int x = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > x){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }
        for (int i = 0 ; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}
