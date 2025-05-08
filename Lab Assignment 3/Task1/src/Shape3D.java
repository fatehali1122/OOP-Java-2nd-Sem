public abstract class Shape3D extends Shape{
    public Shape3D(String name) {
        super(name);
    }
    public abstract double volume();

    @Override
    public String toString() {
        return String.format(super.toString());
    }
}
