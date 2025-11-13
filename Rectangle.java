import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape{

    private final double width;
    private final double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return  width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        var shapeList = new ArrayList<Shape>();

        for(int i = 0; i <= 3; i ++){
            shapeList.add(new Rectangle(i, i+2));
            shapeList.add(new Circle(i +2));
        }

        for(Shape shape : shapeList){
System.out.println("Shape: " + shape.toString() + " Area: " + shape.area());
        }
    }
}
