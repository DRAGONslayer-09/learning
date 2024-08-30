package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class A52_BubbleSort {
    static void bubble(int[]arr, int n){
        for (int i =0; i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int x = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }

                }
            }
        }

    public static void main(String[] args) {
        int []ar={1,5,8,6};
        int x= ar.length;
        bubble(ar,x);
        for (int i=0;i<=ar.length-1;i++){
            System.out.println(ar[i]);
        }
    }
}
