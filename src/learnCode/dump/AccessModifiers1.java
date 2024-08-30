package learnCode.dump;

class Cylinder{
    private int Radius;
    private int Height;

    public int getRadius() {
        return Radius;
    }
    public void setRadius(int radius) {
        Radius = radius;
    }
    public int getHeight() {
        return Height;
    }
    public void setHeight(int height) {
        Height = height;
    }

    public double getSurfacedArea(){
        return 2*Math.PI*Radius*Height + 2*Math.PI*Radius*Radius;
    }

    public static void main(String[] args) {

        Cylinder myCylinder = new Cylinder();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getSurfacedArea());

    }

}
