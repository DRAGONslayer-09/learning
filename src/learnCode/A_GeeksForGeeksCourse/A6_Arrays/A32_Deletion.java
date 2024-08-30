package learnCode.A_GeeksForGeeksCourse.A6_Arrays;

public class A32_Deletion {
    public static void main(String[] args) {
        int [] ar = new int[]{1,6,8,2,12,34};
        int [] ar2 = new int[ar.length-1];
        int x = 2;
        for (int i=0,j=0; i<ar.length;i++){
            if (i!=x) {
                ar2[j] = ar[i];
                j++;
            }
        }
        System.out.println("");
        for (int i : ar2) {
            System.out.println(i);
        }
    }

}
