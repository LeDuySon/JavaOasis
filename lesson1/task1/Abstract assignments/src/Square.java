public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super.setTopLeft(topLeft);
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString() + ",side=" + this.width +  ",color=" + this.color + ",filled=" + this.filled + "]";

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}
