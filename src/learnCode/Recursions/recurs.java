package learnCode.Recursions;

public class recurs {
    public static void main (String[]args){
        int result =sum(5,10);
        System.out.println(result);
    }
    public static int sum(int Start, int End){
        if(End>Start){
            return End + sum(Start,End-1);
        }else{
            return End;
        }
    }
}
