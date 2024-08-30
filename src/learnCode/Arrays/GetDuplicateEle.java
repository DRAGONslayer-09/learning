package learnCode.Arrays;

public class GetDuplicateEle {
    public static void main(String[] args) {
        int[] values = {56,45,86,56,42,32,5,6,45,85};
        for (int i=0; i<= values.length-1;i++){
            for (int j = i+1; j<=values.length-1;j++){
                if (values[i]==values[j]) {
                    System.out.println(values[i]);
                }
            }
        }
    }
}
