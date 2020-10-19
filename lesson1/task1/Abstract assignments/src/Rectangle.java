import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /**
     * @param width a
     * @param length a
     * @param color a
     * @param filled a
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * @param topLeft a
     * @param width a
     * @param length a
     * @param color a
     * @param filled a
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0
                && Double.compare(rectangle.length, length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    @Override
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString()
                + ",width=" + this.width +
                ",length=" + this.length + ",color=" +
                this.color + ",filled=" + this.filled + "]";
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle(new Point(1, 2), 10.23, 11.36, "red", true);
        System.out.println(a.toString());
    }
}
