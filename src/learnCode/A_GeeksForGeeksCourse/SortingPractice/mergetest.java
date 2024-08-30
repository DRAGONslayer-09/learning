package learnCode.A_GeeksForGeeksCourse.SortingPractice;

import java.util.Arrays;

public class mergetest {
    public static void main(String[] args) {
        int[]arr={24,12,51,32,15};
        sep(arr,0,arr.length-1);
        print(arr);
    }
    private static void print(int []arr){
        for (int i =0;i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void sep(int []arr,int left,int right){
        if (left<right){
        int mid = left+(right-left)/2;

        sep(arr,left,mid);
        sep(arr,mid+1,right);
        msort(arr,left,mid,right);
    }
    }
    private static void msort(int[]arr,int left, int mid, int right){
        int leftL = mid - left + 1;
        int rightL = right - mid;

        int[] Lar = new int[leftL];
        int []Rar = new int[rightL];
        /*for (int i = 0 ; i< arr.length;i++){
            System.out.println(arr[i] + " arr ");
        }*/
        for (int i =0;i< leftL; i++){
            Lar[i] = arr[left+i];
            //System.out.println(Lar[i] + "After left");
           // System.out.println(Arrays.toString(Lar));
        }
        for (int j =0; j <rightL; j++){
            //System.out.println(Lar[j] + "Before");
            Rar[j] = arr[mid+1+j];
            //System.out.println(Arrays.toString(Rar) + "Right loop");
            //System.out.println(Lar[j] + " After right Loop");
        }

        int i =0, j=0;
        int k = left;

        while(i<leftL && j<rightL){
            if (Lar[i]<Rar[j]){
                arr[k] = Lar[i];
                i++;
            }else{
                arr[k] = Rar[j];
                j++;
            }k++;
        }
        while(i!= Lar.length){
            arr[k] = Lar[i];
            i++;
            k++;
        }
        while(j!=Rar.length){
            arr[k] = Rar[j];
            j++;
            k++;
        }

    }
}
