package learnCode.Arrays;

public class findSpecific {
    public static boolean find(int[] arr, int value) {
        int x = 0;
        for (int f : arr) {
            if (value == f) {
                return true;
            }
        }return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 8};
        System.out.println(find(arr, 5));
        final int length;
        System.out.println(arr.length);
    }
}
