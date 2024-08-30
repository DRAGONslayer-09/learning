package learnCode.dump;

public class methodOverloading1 {
    static int meth1(int x,int y){
        return x+y;
    }
    static float meth1(float x,float y){
        return x+y;
    }

    public static void main(String[]args){
        int A=meth1(5,8);
        float X =meth1(5.5f,6.8f);

        System.out.println(A);
        System.out.println(X);
    }
}
