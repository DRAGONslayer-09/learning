package learnCode.Recursion;
public class factorial {
    public static int calfacto(int f){
        if (f == 0){
            return 1;
        }
        return f*calfacto(f-1);
    }

    public static void main(String[] args) {
        int number = 7;
        int calfacto = calfacto(number);
        System.out.println(calfacto);
    }

}
