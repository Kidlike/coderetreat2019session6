package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CoordinateTest {
    @Test
    public void sameCoordinatesShouldBeEqual() {
        Coordinate c1 = new Coordinate(0, 1, 2);
        Coordinate c2 = new Coordinate(0, 1, 2);
        assertEquals(c1, c2);

        Coordinate c3 = new Coordinate(0, 1, 3);
        assertNotEquals(c1, c3);

    }
}
