package learnCode.Recursion;

public class sumOfODDnums {
    public static int OddSum(int[] arr) {
        return OddSum(arr, 0);
    }

    private static int OddSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        int sum = OddSum(arr, index + 1);
        if (arr[index] % 2 != 0) {
            sum += arr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9
        };
        int sum = OddSum(numbers);
        System.out.println("sum = " + sum);
    }
}
