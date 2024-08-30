package learnCode.Abstraction.practice;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1,double side2, double side3){
        this.side1 = side1  ;
        this.side2 = side2;
        this.side3 = side3;
    }
    double Area(){
        double side =   (side1+side2+side3);
        return Math.sqrt(side*(side-side1)*(side - side2)*(side-side3));
    }

    @Override
    double Perimeter() {
        return side1+side2+side3;
    }


}
