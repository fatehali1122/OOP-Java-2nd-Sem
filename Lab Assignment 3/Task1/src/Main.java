public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[20];
        Shape2D shape2D;
        Shape3D shape3D;

        Shape2D circle1 = new Circle("Circle",true, 2, new Point(0,0));
        System.out.println(circle1.area());

        Shape2D rectangle1= new Rectangle("Rectangle",true, 2, 3, new Point(3,4));
        Shape2D rectangle2= new Rectangle("Rectangle",true, 4, 5, new Point(4,5));
        Shape2D rectangle3= new Rectangle("Rectangle",true, 5, 6, new Point(5,6));
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter(2,3));

        Shape3D sphere1 = new Sphere("Sphere", 2);
        System.out.println(sphere1.area());
        System.out.println(sphere1.volume());

        Shape3D cube1 = new Cube("Cube", 3);

        shape[0] = cube1;
        shape[1] = circle1;
        shape[2] = rectangle1;
        shape[3] = sphere1;
        shape[4] = cube1;
        shape[5] = circle1;
        shape[6] = rectangle2;
        shape[7] = cube1;
        shape[8] = sphere1;
        shape[9] = cube1;
        shape[10] = circle1;
        shape[11] = sphere1;
        shape[12] = rectangle3;
        shape[13] = sphere1;
        shape[14] = cube1;
        shape[15] = cube1;
        shape[16] = circle1;
        shape[17] = rectangle1;
        shape[18] = sphere1;
        shape[19] = cube1;

        ShapeUtils shapeUtils = new ShapeUtils();
        shapeUtils.displayShape(shape);

        shapeUtils.updateLength(shape);
        System.out.println("After Updating Length of Rectangles\n");
        shapeUtils.displayShape(shape);

        shapeUtils.drawDrawables(shape);

        Rectangle r = (Rectangle) rectangle1;
        System.out.println("Rectangle Is Intersecting:"+ shapeUtils.isIntersectWithRectangles(shape,r));


    }
}