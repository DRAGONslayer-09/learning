package learnCode.A_GeeksForGeeksCourse.A3_Arrays_Strings;

public class a19_DeciToBinary {
    public static void main(String[] args) {
        String s = "";
        int x = 25;
        while(x>0){
            s = (x%2)+s;
            x = x/2;
        }
        System.out.println(s);
    }
}
