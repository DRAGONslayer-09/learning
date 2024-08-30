package learnCode.A_GeeksForGeeksCourse.Sorting;

public class bubprac {
    public static void main(String[] args) {
        int[] arr = {12, 25, 14, 13, 61};
        sor(arr);
        print(arr);
        revsort(arr);
        print(arr);
        revprint(arr);
    }
    private static void print(int []arr){
        for (int i :arr){
            System.out.println(i);
        }
    }
            private static void sor(int [] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }
    private static void revsort(int[]arr){
        for (int i = 0;i< arr.length;i++){
            for (int j = i+1; j< arr.length;j++){
                if (arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    private static void revprint(int[]arr){
        for (int i = arr.length -1; i>=0; i--){
            System.out.println(arr[i] + " rev");
        }
    }
}
