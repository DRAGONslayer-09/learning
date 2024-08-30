package learnCode.AllinOne;

public class StringReverse {
    public static void main(String[] args) {
        String a = "Hello People";
        String R = "";
        for (int i = 0; i< a.length(); i++){
            R = a.charAt(i) + R;
        }
        System.out.println(R);
    }
}
