package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class insertion {
    public static void main(String[] args) {
        int [] arr = {64,25,12,22,11};
        ins(arr);
    }

    private static void ins(int[] arr) {
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
