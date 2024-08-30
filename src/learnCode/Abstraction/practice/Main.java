package learnCode.Abstraction.practice;

public class Main {
    public static void main(String[] args) {
        Shape mycircle = new Circle(4.0);
        Shape mytriangle = new Triangle(5.0,4.0,3.0);
        System.out.println("Area of circle with radius 4 is" + mycircle.Area());
        System.out.println("Area of a Triangle with sides 5,4,3 is" + mytriangle.Area());
        System.out.println("Perimeter of circle with radius 4 is" + mycircle.Perimeter());
        System.out.println("Perimeter of a Triangle with sides 5,4,3 is" + mytriangle.Perimeter());
    }
}
