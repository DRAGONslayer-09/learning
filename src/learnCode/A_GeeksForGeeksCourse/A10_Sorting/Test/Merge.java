package learnCode.A_GeeksForGeeksCourse.A10_Sorting.Test;

public class Merge {
    public static void main(String[] args) {
        int [] arr ={12,24,25,13,18};
        sort(arr,0,arr.length-1);
        print(arr);
    }
    private static void print(int []arr){
        for (int i = 0  ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void sort(int []arr, int low,int high){
        if (low<high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1, high);
            merg(arr,low,mid,high);
        }
    }
    private static void merg(int []arr, int low ,int mid, int high){
        int LL = mid - low+1;
        int HL = high - mid;

        int [] L = new int[LL];
        int [] H = new int[HL];

        for (int i =0; i< L.length;i++){
            L[i] = arr[i];
        }
        for (int i =0 ; i< H.length; i++){
            H[i] = arr[mid+1+i];
        }
        int i =0, j = 0;
        int k= low;
        while(i<LL && j<HL){
            if (L[i]>=H[j]){
                arr[k] = H[j];
                j++;
            }
            else{
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        /*for (int i =0 ; i<arr.length;i++){
            if (L[i]>H[i]){
                arr[i] = H[i];
            }
        }*/

    }
}
