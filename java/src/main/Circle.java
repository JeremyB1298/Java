public class Circle implements Shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius){

        this.center = center;
        this.radius = radius;

    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public Double area() {
        return null;
    }
}
