package learnCode.AllinOne;

import java.util.Arrays;

public class arrSort {
    public static void main(String[] args) {
        String[] bikes = {"BMW", "KTM","Yezdi"};
        Arrays.sort(bikes);
        for (String x : bikes){
            System.out.println(x);
        }
    }
}
