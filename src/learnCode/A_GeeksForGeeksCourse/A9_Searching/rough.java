package learnCode.A_GeeksForGeeksCourse.A9_Searching;

public class rough {
    public static void main(String[] args) {
        int []ar = {1,2,3,5};
        miss(ar);
    }
    static void miss(int []arr){
        int x =arr.length;
        int missing = -1;

        for (int i=0;i<x;i++){
            if(arr[i]>0){
                missing = i+1;
                break;
            }
        }
        System.out.println(missing);
    }
}
