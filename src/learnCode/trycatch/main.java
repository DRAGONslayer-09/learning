package learnCode.trycatch;

public class main {
    public static void main(String[] args) {
        trycathfinally trycathfinally = new trycathfinally();
        boolean flag=trycathfinally.validateAge(-1);
       if(flag){
           System.out.println("given age is validate");
       }else {
           System.out.println("given agen is not validated");
       }
    }
}
