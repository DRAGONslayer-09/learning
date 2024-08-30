package learnCode.practiceOOPS.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dg = new Dog("Jimmy", "German Shepherd");
        Dog dg2 = new Dog("Jesko", "Husky");
        System.out.println(dg.getBreed() + dg.getDogName());
        System.out.println(dg2.getBreed() + dg2.getDogName());
        dg2.setBreed("Pug");
        System.out.println(dg2.getBreed() + dg2.getDogName());

    }
}
