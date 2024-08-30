package learnCode.Abstraction.Animals;

public class Main {
    public static void main(String[] args) {
        Animals ct = new Cat();
        Animals dg = new Dog();
        Animals sr = new Sher();

        dg.eat();
        dg.sleep();
        dg.sound();
        System.out.println("");
        ct.sleep();
        ct.sound();
        ct.eat();
        System.out.println("");
        sr.sleep();
        sr.eat();
        sr.sound();
    }
}
