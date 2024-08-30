package learnCode.A_GeeksForGeeksCourse.Sorting;

public class mergeTest {
    public static void main(String[] args) {
        int []arr = {12,24,13,51,22};
        sep(arr,0,arr.length-1);
        print(arr);
    }
    private static void merge(int[]arr, int left, int mid, int right){
        int ll = mid- left + 1;
        int rl = right - mid;

        int [] lar = new int[ll];
        int [] rar = new int [rl];

        for (int i =0 ; i < ll ; i ++){
            lar[i] = arr[left+i];
        }
        for (int i =0;i< rl; i++){
            rar[i] = arr[mid + 1 + i];
        }
        int i = 0, j =0;
        int k = left;
        while(i<ll & j<rl){
        if (lar[i]<rar[j]){
            arr[k] = lar[i];
            i++;
        } else{
            arr[k] = rar[j];
            j++;
        }k++;
        }

        while(i<ll){
            arr[k] = lar[i];
            i++;
            k++;
        }
        while(j<rl){
            arr[k] = rar[j];
            j++;
            k++;
        }
    }
    private static void sep(int[]arr,int left,int right){
        if (left<right){
            int mid = left + (right-left)/2;

            sep(arr,left,mid);
            sep(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    private static void print(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
