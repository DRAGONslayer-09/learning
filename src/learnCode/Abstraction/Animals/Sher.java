package learnCode.Abstraction.Animals;

import javax.crypto.spec.PSource;

public class Sher implements Animals{
    @Override
    public void eat() {
        System.out.println("Sher eats");
    }

    @Override
    public void sleep() {
        System.out.println("Sher zzzzz");
    }

    @Override
    public void sound() {
        System.out.println("Roar Roar");
    }
}
