package learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance;

public class Dog extends learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance.Animax {
    Dog(String name, int Age) {
        super(name, Age);
    }
    @Override
    public void Sound() {
        System.out.println("grrrrrrr");
    }
}
