public class Sphere extends Shape3D{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double area(){
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public double volume() {
        return (4.0/3) * Math.PI * radius * radius * radius;
    }
    @Override
    public String toString() {
        return String.format(super.toString() + "Volume: %.2f Area: %.2f\n",volume(),area());
    }
    public void draw(){
        System.out.println("This is drawable Sphere");
    }
}
