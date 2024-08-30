package learnCode.newArray;

public class duplicateValue {
    public static void main(String[] args) {
        int [] crax = {2,3,5,6,8,2,6,4,9,12,65};
        int [] drax = {2,68,5,2,56,19,8,26};
        for (int i = 0; i<crax.length;i++){
           // for (int j = i; j< crax.length; j++){
            for(int j = 0; j< drax.length; j++){
                if ((crax[i]==drax[j])){
                    System.out.println(crax[i]);
                }
            }
        }
    }
}
