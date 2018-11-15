import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void contains(){
        Point p1  = new Point(3,3);
        Point p2 = new Point(4,3);
        Circle c = new Circle(p1,1);

        assertTrue(c.contains(p2));
    }

    @Test
    public void getArea(){
        Point p1  = new Point(3,3);
        Circle c = new Circle(p1,1);
        Double area = c.area();
        assertEquals(Math.PI,area,DELTA);
    }

}
