package learnCode.A_GeeksForGeeksCourse.Sorting;

import sun.rmi.server.MarshalOutputStream;

public class bubble {
    public static void main(String[] args) {
        int [] arr ={12,35,10,22,26};
        for (int i =0; i< arr.length;i++){
            for (int j = i+1; j< arr.length;j++){
/*                System.out.println(arr[i] + "KEM");
                System.out.println(arr[j] + "J");*/
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        for (int  i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
