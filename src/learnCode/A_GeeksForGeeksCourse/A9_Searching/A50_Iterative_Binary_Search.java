package learnCode.A_GeeksForGeeksCourse.A9_Searching;

import java.util.Arrays;

public class A50_Iterative_Binary_Search {
    static int search (int []arr,int x){
        int low =0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==x)
                return mid;
            else if(arr[mid]>x)
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] ar = {10,8,30,40,5};
        int x = 40;
        System.out.println(search(ar,x));
    }
}
