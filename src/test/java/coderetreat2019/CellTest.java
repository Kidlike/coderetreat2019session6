package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CellTest {
    @Test
    public void sameCoordinatesShouldBeEqual() {
        Cell c1 = new Cell(0, 1, 2);
        Cell c2 = new Cell(0, 1, 2);
        assertEquals(c1, c2);

        Cell c3 = new Cell(0, 1, 3);
        assertNotEquals(c1, c3);
    }
}
