package learnCode.dump;

public class method {
    public static int mini(int n1,int n2){
        int min;
        if (n1>n2)
            min = n2;
        else
            min = n1;
        return min;

    }
    public static void main(String [] args){
        int a = 25;
        int b = 26;
        int c = mini(a,b);

        System.out.println(c + " is minimum");
    }
}
