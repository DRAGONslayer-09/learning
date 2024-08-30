package learnCode.dump;

public class practiceTest {
    public static void main(String[]args){
        float [] marks = {20.0f, 36.0f,85.6f,0.5f};
        float sum =0;
        for (float element:marks){
            sum = sum+element;
        }
        System.out.println("the total value is " +sum);
    }

}
