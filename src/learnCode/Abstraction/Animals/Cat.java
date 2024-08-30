package learnCode.Abstraction.Animals;

public class Cat implements Animals{


    @Override
    public void eat() {
        System.out.println("yaw yaw");
    }

    @Override
    public void sleep() {
        System.out.println("Cat zzzz");
    }

    @Override
    public void sound() {
        System.out.println("Meow meow");
    }
}
