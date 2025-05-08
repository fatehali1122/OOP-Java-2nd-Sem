public class Circle extends Shape2D{
    private double radius;
    Point center ;

    public Circle(String name, boolean isFilled, double radius, Point center) {
        super(name, isFilled);
        this.radius = radius;
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return String.format(super.toString() + "Area: %.2f \n", area() );
    }
    public void draw() {
        System.out.println("This is drawable circle");
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
