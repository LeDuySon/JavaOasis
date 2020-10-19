public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    ;

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        double s = super.getArea();
        return s * this.height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[" + super.toString() + ",height=%.1f]", this.height);
    }

    @Override
    public double getArea() {
        double circleA = super.getArea();
        double CylinderA = 2 * PI * super.getRadius() * this.height;
        return CylinderA + 2 * circleA;
    }

}
