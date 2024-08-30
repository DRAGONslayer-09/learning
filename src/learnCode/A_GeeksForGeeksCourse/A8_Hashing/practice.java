package learnCode.A_GeeksForGeeksCourse.A8_Hashing;

public class practice {
    public static void main(String[] args) {
        int [] arr  = {4,1,-3,2,5};
        System.out.println(find(arr));
    }

    private static boolean find(int[] arr) {
        int x = 0;
        for (int i= 0; i<arr.length;i++){
           x= x+arr[i];
            if (x==0){
                return true;
            }
        }return false;
    }
}
