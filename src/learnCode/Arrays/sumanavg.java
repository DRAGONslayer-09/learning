package learnCode.Arrays;

public class sumanavg {
    public static void main(String[] args) {
        float arrx[] = {1,2,3,4,5,6,7,8,9,10};
        float sum =0;
       /* for (int i = 0; i< arrx.length; i++ ){
            float x = arrx[i];
            sum = sum + x;
            System.out.println(x);
        }*/
        for (int i = arrx.length-1; i>= 0; i-- ){
            float x = arrx[i];
            sum = sum + x;
        }
        System.out.println(sum);
        System.out.println(sum/ arrx.length);

    }
}
