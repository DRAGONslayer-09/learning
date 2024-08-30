package learnCode.OldAbstraction;

public interface first {
    public void mymethod();
}
interface second{
    public void mymethod2();
}
class trial implements first, second{

    @Override
    public void mymethod() {
        System.out.println("hello JI");
    }

    @Override
    public void mymethod2() {
        System.out.println("maja madi");
    }
}
class main{
    public static void main(String[]args){
        trial x = new trial();
        x.mymethod();
        //x.mymethod2();
    }
}
