package learnCode.newArray;

public class AvgValue {
    public static void main(String[] args) {
        double [] eleme = {1,5,6,8,3,4,6,2,9,3};
        double sum =0;
        for (double i =0; i<= eleme.length; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println(sum/ eleme.length);
    }
}
