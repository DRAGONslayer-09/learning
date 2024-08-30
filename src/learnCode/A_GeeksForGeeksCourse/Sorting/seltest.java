package learnCode.A_GeeksForGeeksCourse.Sorting;

public class seltest {
    public static void main(String[] args) {
        int[] arr = {12, 23, 10, 15, 25, 11};
        sel(arr);
    }
    private static void sel(int[]arr){
        for (int i =0;i<arr.length; i++){
            int min = i;
            System.out.println(arr[i]);

            System.out.println(min + "min in first loop");
            for (int j = i+1; j < arr.length; j++){
                System.out.println(min);
                if (arr[min]> arr[j]){
                   min = j;
                   System.out.println(min + "Updated");
                   System.out.println(arr[j]);
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            print(arr);
        }
    private static void print(int[]arr){
        for (int  i : arr){
            System.out.println(i);
        }
    }
}
