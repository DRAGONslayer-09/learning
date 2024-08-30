
package learnCode.A_GeeksForGeeksCourse.A10_Sorting.Test;
class AB{
    public int method1 (){
        return 20;
    }
}
class B extends AB{
    public int method1(){
        return 30;
    }
    public int method2(){
        return 40;
    }
}
class C extends B{
    public int method2(){
        return 20;
    }
}
class tester{
    public static void main(String[] args) {
        AB a = new AB();
        B b  = new B();
        C c = new C();
        System.out.println(a.method1()+c.method1()+c.method2());
    }
}
