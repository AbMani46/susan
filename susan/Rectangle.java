package susan;

public class Rectangle implements GeometricObject {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getPerimeter() {
        return 2 *(length * width);
    }
    public double getArea() {
        return length * width;
    }


    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}
