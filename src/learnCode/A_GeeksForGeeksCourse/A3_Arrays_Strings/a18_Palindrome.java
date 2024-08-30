package learnCode.A_GeeksForGeeksCourse.A3_Arrays_Strings;

public class a18_Palindrome {
    public static void main(String[] args) {
        String str = "MADAm";
        String str2 ="";
        int size = str.length()-1;
        while(size>=0){
            str2 = str2+str.charAt(size);
            size--;
        }
        if (str.equals(str2)){
        System.out.println(str + " Strig is Palindrome");
    }else{
            System.out.println(str + " is not a Palindrome");
        }
    }
    }
