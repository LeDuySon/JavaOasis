import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }


    public double distance(Point other) {
        double diffX = this.pointX - other.pointY;
        double diffY = this.pointY - other.pointY;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }


    public boolean equals(Object s) {
        if (this == s) {
            return true;
        }
        if (s instanceof Point) {
            if (this.pointX == ((Point) s).pointX && this.pointY == ((Point) s).pointY) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    @Override
    public String toString() {
        return "(" + (double) Math.round(pointX * 10) / 10
                + "," + (double) Math.round(pointY * 10) / 10 + ")";
    }
}
