package learnCode.A_GeeksForGeeksCourse.A7_Recursion;

class trial {
    static int fun(int x) {
        if (x == 0)
            return 0;
    else
            return 1+ fun(x/2);

    }

    public static void main(String[] args) {
        System.out.println(fun(16));
    }
}
