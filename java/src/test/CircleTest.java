import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void contains(){
        Point p1  = new Point(3,3);
        Point p2 = new Point(3,89);
        Circle c = new Circle(p1,1);

        assertTrue(c.contains(p2));
    }
}
