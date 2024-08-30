package learnCode.A_GeeksForGeeksCourse;

public class MergS {
    public static void main(String[] args) {
        int  [] arr = {22,26,21,20,28};
        //sort(arr);
        print(arr);
    }
    private static void print(int[]arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void sort(int[]arr,int left, int right){
        int mid = (left+right)/2;

        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr, left,mid,right);
    }
    private static void merge(int []arr, int left, int mid, int right){
        int ll = mid - left;
        int rl = right - mid+1;
        int [] LeftArr = new int [ll];
        int [] RightArr = new int[rl];
        for (int  i= 0; i< ll;i++ ){
            LeftArr[i] = arr[i];
        }
        for (int i =0; i< rl; i++){
            RightArr[i] = arr[mid+i];
        }
        int x = 0, y=0;
        int z = left;

       // while(left<)
    }
}
