package learnCode.practiceOOPS.person;

public class Main {
    public static void main(String[] args) {
     Person x = new Person("Tani", 22);
     Person y = new Person("Mirav", 1);
        System.out.println(x.getAge());
        System.out.println(x.getName());
        System.out.println();
        y.setName("kris");
        System.out.println(y.getName());
    }
}
