package learnCode.InterfaceExe.Area;

public class Main {
    public static void main(String[] args) {
        Shape sq = new Square(5.0);
        Shape rec = new Rectangle(4.0,2.0);
        Shape cir = new Circle(5.0);

        System.out.println(sq.getArea());
        System.out.println(rec.getArea());
        System.out.println(cir.getArea());
    }
}
