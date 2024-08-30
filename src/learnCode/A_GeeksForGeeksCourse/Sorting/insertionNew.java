package learnCode.A_GeeksForGeeksCourse.Sorting;

public class insertionNew {
    public static void main(String[] args) {
        int []arr={12,24,26,10,40};
        ins(arr);
    }
    private static void ins(int[]arr){
        for (int i = 1;i<arr.length-1;i++){
            int el = arr[i];
            int j = i -1;
            while(j>=0 && arr[j]>el){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1]=el;

        }
        print(arr);
    }
    private static void print(int[]arr){
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
