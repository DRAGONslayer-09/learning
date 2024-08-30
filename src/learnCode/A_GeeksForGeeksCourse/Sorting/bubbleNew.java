package learnCode.A_GeeksForGeeksCourse.Sorting;

public class bubbleNew {
    public static void main(String[] args) {
        int [] arr = { 102,34,13,26,40};
        sort(arr);
    }
    private static void sort(int[]arr){
        for (int  i = 0 ; i< arr.length;i++){
            for (int j = 0; j< arr.length-1;j++){
                //System.out.println(arr[j] + "J");
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }
    private static void print(int[]arr){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
