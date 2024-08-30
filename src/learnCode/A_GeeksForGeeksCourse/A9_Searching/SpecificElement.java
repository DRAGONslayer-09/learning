package learnCode.A_GeeksForGeeksCourse.A9_Searching;
//find a specific element
public class SpecificElement {
    public static void main(String[] args) {
        int []arr = {1,3,6,9,5};
        int val = 2;
        spec(arr,val);
    }

    private static int spec(int[] arr,int value) {
        int high = arr.length-1 ;
        int low =0;
        while(low <= high) {
            int mid = (low + high / 2);
            if (arr[mid] == value)
                System.out.println(mid);

            if (arr[mid] < value)
                System.out.println(high = mid - 1);

            if (arr[mid] > value)
                System.out.println(low = mid + 1);
        }
        return value;
    }
}
