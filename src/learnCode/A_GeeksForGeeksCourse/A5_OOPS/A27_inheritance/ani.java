package learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance;

public class ani {
    public static void main(String[] args) {
        learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance.Animax cat = new learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance.Cat("Pluto", 6);
        cat.Sound();
        learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance.Animax dog = new learnCode.A_GeeksForGeeksCourse.A5_OOPS.A27_inheritance.Dog("Jimmy", 9);
        dog.Sound();
        System.out.println(dog.name);
    }
}
