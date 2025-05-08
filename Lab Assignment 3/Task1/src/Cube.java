public class Cube extends Shape3D{
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public double area() {
        return 6 * (side * side);
    }
    @Override
    public String toString() {
        return String.format(super.toString() + "Volume: %.2f Area: %.2f\n", volume(), area());
    }
    public void draw(){
        System.out.println("This is drawable cube");
    }
}
