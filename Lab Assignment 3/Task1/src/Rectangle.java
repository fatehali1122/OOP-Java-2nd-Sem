import java.awt.*;

public class Rectangle extends Shape2D{

    private double width;
    private double length;
    private Point topLeftCorner;

    public Rectangle(String name, boolean isFilled, double width, double length, Point topLeftCorner) {
        super(name, isFilled);
        this.width = width;
        this.length = length;
        this.topLeftCorner = topLeftCorner;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double area() {
        return width * length;
    }
    public double perimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString() {
        return String.format(super.toString() + "Area: %.2f Perimeter: %.2f\n", area(), perimeter());
    }
    public void draw(){
        System.out.println("This is drawable rectangle");
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public void setTopLeftCorner(Point topLeftCorner) {
        this.topLeftCorner = topLeftCorner;
    }
}
