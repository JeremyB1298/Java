public class Rectangle implements Shape {

    private Point topLeftCorner;
    private int width;
    private int height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean contains(Point p) {
        if ( p.getY() >= topLeftCorner.getY()-height
                && p.getY() <= topLeftCorner.getY()
                && p.getX() >= topLeftCorner.getX()
                && p.getX() <= topLeftCorner.getX()+width){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Double area() {
        return (double)width*height;
    }
}
