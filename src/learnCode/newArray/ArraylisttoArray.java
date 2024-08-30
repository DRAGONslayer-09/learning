package learnCode.newArray;

import java.util.ArrayList;

public class ArraylisttoArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Merc");
        list.add("BMW");
        list.add("Volvo");

        String [] arra = new String[list.size()];
        list.toArray(arra);
        for (String string: arra){
            System.out.println(string);
        }

    }
}
