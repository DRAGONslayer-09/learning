package learnCode.A_GeeksForGeeksCourse.Sorting;

public class insertiontest {
    public static void main(String[] args) {
        int []arr = {12,35,14,22,40};
        ins(arr);
        print(arr);
    }
    private static void print(int []arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void ins(int []arr){
        for (int i =1;i< arr.length; i++){
            int min = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]> min){
                arr[j] =arr[i];
                j--;
            }
            arr[j+1] = min;
        }
    }

}
