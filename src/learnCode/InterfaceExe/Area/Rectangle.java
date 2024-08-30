package learnCode.InterfaceExe.Area;


public class Rectangle implements Shape {
    private double length,breadth;

    public Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length*breadth;
    }
}
