package learnCode.Arrays;
import java.util.Arrays;

public class SecLargestElement {
        public static void main(String[] args) {
           // int[] arr= {15,3,565,9,6565,5656,23,956,65,656,686,8,65,98,22,36578,9898,6656,6989,655};

            int[] arr= {15,3,565,9};
            System.out.println(arr.length);
            System.out.println("OG array : " + Arrays.toString(arr));
            Arrays.sort(arr);
            int index= arr.length -2;
           /* while (arr[index] == arr[arr.length - 1]) {
                index--;
            }*/
            System.out.println("Sorted array"  + Arrays.toString(arr));
            System.out.println("Second largest Element: " + arr[index]);
        }
        public void sort(Arrays[] a){

        }
    }
