package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class sortPrac {
    static void bubble(int []arr,int a){
        for (int i=0; i<=a-1 ; i++) {
            for (int j = 0; j < a-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []ar ={2,6,8,4};
        int a=4;
        bubble(ar,a);
        for (int i =0; i<= a-1;i++){
            System.out.println(ar[i]);
        }
    }
}
