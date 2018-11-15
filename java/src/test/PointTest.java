import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void isDistanceIsCorrect() {
        Point p1 = new Point(8,4);
        Point p2 = new Point(8,4);
        assertEquals("fail distance",0.0,p1.distance(p2),0.001);

    }
    @Test
    public void isMoving() {

    Point p1 = new Point(8,4);
    Point p2 = p1.move(9,8);

    assertEquals(p2,p1);
    }
    @Test
    public void areEquals(){
        Point p1 = new Point(5,6);
        Point p2 = new Point(5,6);

        assertTrue(p2.equals(p1));
    }
    @Test
    public void hascode(){
        Point p1 = new Point(9,8);
        Point p2 = new Point(5,2);

        assertEquals(p1.hashCode(),p2.hashCode());
    }
    @Test
    public void immuable() {
        Point p1 = new Point(8,5);
        Point p2 = p1.move(8,5);
        assertNotSame(p1,p2);
    }
}