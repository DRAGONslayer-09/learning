package learnCode.A_GeeksForGeeksCourse.A10_Sorting;

public class mergeX {
    public static void main(String[] args) {
        int [] arr = {12,24,13,15,38};
        merg(arr,0,arr.length-1);
        print(arr);
    }
    private static void print(int [] arr){
        for (int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void divideAndAdd(int[]arr, int LP, int RP){
        int Mid = (LP +RP)/2;
        int left = Mid - LP;
        int right = RP - Mid+1;
        int [] Left = new int [Mid-1];
        int [] Right = new int[right];

        for (int i =0; i<= Mid;i++ ){
            Left[i] = arr[i];
        }
        for (int j = RP; j>Mid;j--){
            Right[j] = arr[j];
        }

        //Merging
        int i =0, j =0;
        int k =1;
        while(i<LP && j<RP){
            if (Left[i]<Right[j]){
                arr[k]= Left[i];
                i++;
            }else{
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
    }
    private static void sort(int [] arr, int left, int right ){
        if (left<right){
            int mid = left+(right-1)/2;

            sort(arr,left,mid);
            sort(arr,mid+1,right);

            merg(arr,left,right);
        }
    }
    private static void merg(int[]arr,int LP,int RP){

    }

}
