package learnCode.A_GeeksForGeeksCourse.A9_Searching;

public class RecursiveBinary {
    static int recursive(int []arr, int low, int high , int value){
        System.out.println(low + "hello");
        if (high >= low){
            int mid = (high +low) /2;
            if (arr[mid] == value){
                return mid;
            }
            if (arr[mid]> value){
                System.out.println(low);
                return recursive(arr,low,mid-1,value);
            }else{
                return recursive(arr,mid+1,high,value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,6,9,10};
        int h = 5;
        int l = 0;
        int v = 6;
        System.out.println(recursive(arr,l,h,v));
    }
}
