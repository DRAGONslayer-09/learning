package learnCode.A_GeeksForGeeksCourse.A6_Arrays;

public class A35_Reverse {
    public static void main(String[] args) {
        int [] ar = new int[]{1,5,6,9,3};
        for(int i = ar.length-1 ; i >= 0; i-- ){
            System.out.println(ar[i]);
        }
    }
}
