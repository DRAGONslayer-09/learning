package learnCode.Abstraction.practice;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }
    double Area(){
        return Math.PI*radius*radius;
    }
    double Perimeter(){
        return 2* Math.PI*radius;
    }
}
