import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;
    private final double pi = 3.14;

    public Circle() {

    }

    /**
     * Constructor
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor
     * @param radius
     * @param color
     * @param filled
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor
     * @param center
     * @param radius
     * @param color
     * @param filled
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + this.center.toString()
                + ",radius=" + this.radius
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * funct
     * @param other
     * @return
     */
    public boolean equals(Object other) {
        if (other instanceof Circle) {
            if (this.radius == ((Circle) other).radius && this.center.equals(((Circle) other).center)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, center);
    }

    //    public static void main(String[] args) {
//        System.out.println("f");
//
//        Point a = new Point(1, 2);
//        Circle b = new Circle(a, 2, "red", true);
//        Circle c = new Circle(a, 2, "red", true);
//        System.out.println(c.toString());
//        if(b.equals(c)){
//            System.out.println("f");
//        }
}
