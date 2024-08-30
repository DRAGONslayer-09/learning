package learnCode.A_GeeksForGeeksCourse.A3_Arrays_Strings;

public class a17_ReverseString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "";
        int size = a.length()-1;
        while(size>=0){
            b=b+a.charAt(size);
            size--;
        }
        System.out.println(b);

        }
    }

