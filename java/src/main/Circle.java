public class Circle implements Shape {

    private Point center;
    private int radius;

    public Circle(Point center, int radius){

        this.center = center;
        this.radius = radius;

    }

    @Override
    public boolean contains(Point p) {

        double res =Math.sqrt( Math.pow(p.getX() - center.getX(),2) -  Math.pow(center.getY() - p.getY(),2) )  ;
        System.out.println(res);
        if(res > 1.0){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Double area() {
        return null;
    }
}
