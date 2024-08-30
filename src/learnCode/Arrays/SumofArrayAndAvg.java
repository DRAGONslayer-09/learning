package learnCode.Arrays;

public class SumofArrayAndAvg {
    public static void main(String[] args) {
        float arrx[] = {1,2,3,4,5,6,7,8,9,10};
        float sum = 0;

        for (float i:arrx){
            sum += i;
        }
        //float average = sum/ arrx.length;
        System.out.println(sum);
        System.out.println(sum/ arrx.length);
    }
}
