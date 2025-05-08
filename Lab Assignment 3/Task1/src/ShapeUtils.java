public class ShapeUtils {
    public void displayShape(Shape[] shape) {
        for (Shape s : shape) {
            System.out.println(s.toString());
        }
    }
    public void updateLength(Shape[] shape) {
        for (Shape s : shape) {
            if (s instanceof Rectangle) {
                ((Rectangle) s).setLength(4);
            }
        }
    }
    public static void drawDrawables(Drawable[] drawables) {
        for (Drawable d : drawables) {
            d.draw();
        }
    }
    public static boolean isIntersectWithRectangles(Shape[] shapes, Rectangle otherRectangle) {
        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                if (((Rectangle) s).getTopLeftCorner().getX() > otherRectangle.getTopLeftCorner().getX()) {
                    return true;
                }
                if (((Rectangle) s).getTopLeftCorner().getY() > otherRectangle.getTopLeftCorner().getY()) {
                    return true;
                }
            }

        }
        return false;
    }
}