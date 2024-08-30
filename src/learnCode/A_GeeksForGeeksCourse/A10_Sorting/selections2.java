package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class selections2 {
    public static void main(String[] args) {
        int []arr = {15,25,35,11,42};
        sele(arr);

    }

    private static void sele(int[] arr) {
        for (int i =0; i<arr.length;i++){
            int l = i;
            for (int j = l+1; j< arr.length; j++){
                if (arr[j]>arr[l]){
                    l = j;
                }
                int temp = arr[l];
                arr[l] = arr[j];
                arr[j] = temp;
            }
        }
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
