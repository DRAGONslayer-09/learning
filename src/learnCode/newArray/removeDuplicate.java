package learnCode.newArray;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] fredo = {10, 20, 60, 10, 65, 30, 20};
        Arrays.sort(fredo);
       /* for (int i : fredo) {
            System.out.println(i);
        }*/
        int index = 1;
        for (int x = 1; x < fredo.length; x++) {
            if (fredo[x] != fredo[index - 1])
                fredo[index++] = fredo[x];
            }

    }
    }
