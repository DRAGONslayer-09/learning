package learnCode.Abstraction.Animals;

public class Dog implements Animals{
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog zzzz");
    }

    @Override
    public void sound() {
        System.out.println("Bark Bark");
    }
}
