package learnCode.AllinOne;

public class SumofArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 3, 5, 7, 9};
        for (int i = 0; i < arr.length; i++ ){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}