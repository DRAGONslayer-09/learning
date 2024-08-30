package learnCode.Recursion;

public class lengthOfString {
    public static int calculateStringLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + calculateStringLength(str.substring(1));
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        int length = calculateStringLength(input);
        System.out.println("The length of " + input + "\" is: " + length);
    }
}
