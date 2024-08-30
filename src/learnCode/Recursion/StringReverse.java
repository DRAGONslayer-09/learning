package learnCode.Recursion;

public class StringReverse {
    public static String revString(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        return revString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        String reversed = revString(input);
        System.out.println(reversed);
    }
}
