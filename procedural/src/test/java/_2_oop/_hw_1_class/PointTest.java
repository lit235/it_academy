package _2_oop._hw_1_class;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {

        assertEquals(new Point(1,1).distance(2,2), 1.414213562f,0.0001d);
    }

    @Test
    public void translate() {
        assertEquals(new Point(1,1).translate(4,4),new Point(5,5));
    }

    @Test
    public void scale() {
        assertEquals(new Point(3,3).scale(2),new Point(6,6));
    }
}