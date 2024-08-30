package learnCode.dump.inheritance;

class A{
    public int met1(){
        System.out.println(5);
        return 5;
    }
    public void met2(){
        System.out.println("This is from meth2");
    }
}
class B extends A{
    public void met3(){
        System.out.println("I am from meth 3");
    }
    public void met2(){
        System.out.println("This is from meth 2");
    }
}

public class Overriding {
    public static void main(String[]args){

        A a = new A();
        a.met2();

        B b = new B();
        b.met2();
        b.met1();
        b.met3();


    }

}
