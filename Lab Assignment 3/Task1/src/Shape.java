public abstract class Shape implements Drawable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public double perimeter(double a, double b) {
        return 2*(a+b);
    }
    public String toString() {
        return String.format("Shape: %s\n", name);
    }
}
