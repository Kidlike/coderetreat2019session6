package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {
    @Test
    public void sameCoordinatesShouldBeEqual() {
        Coordinate c1 = new Coordinate(0, 1);
        Coordinate c2 = new Coordinate(0, 1);

        assertEquals(c1, c2);
    }
}
