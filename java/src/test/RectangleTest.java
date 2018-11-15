import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RectangleTest {

    @Test
    public void contains(){
        Point p1  = new Point(3,3);
        Point p2 = new Point(6,3);
        Rectangle r = new Rectangle(p1,3,3);

        assertTrue(r.contains(p2));
    }

    @Test public void getArea(){
        Point p1  = new Point(3,3);
        Rectangle r = new Rectangle(p1,3,4);
        double area =  r.area();
        assertEquals(12,area,0.01);

    }

}
