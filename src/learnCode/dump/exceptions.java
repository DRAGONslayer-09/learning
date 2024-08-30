package learnCode.dump;

public class exceptions {
    public static void main(String[]args){
        try {
            int[] x = {2, 3, 6, 5, 8, 4, 5};
            System.out.println(x[7]);
        }
        catch(Exception e){
            System.out.println("there has been an error");
        }finally {
            System.out.println("hello");

        }
        String line = "Hexa";
        System.out.println(line);
    }}
