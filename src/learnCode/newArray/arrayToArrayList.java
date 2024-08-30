package learnCode.newArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToArrayList {
    public static void main(String[] args) {
        String [] Animals = {"Cat", "Dog", "Lion"};
        List<String> list= Arrays.asList(Animals);
        System.out.println(Arrays.toString(Animals));
        System.out.println("\n");
        ArrayList<String> arrayList = new ArrayList<>(list);
        /*for (int i = 0; i < Animals.length; i++) {
            System.out.println(Animals[i]);
        }*/
        System.out.println();
    }
}
