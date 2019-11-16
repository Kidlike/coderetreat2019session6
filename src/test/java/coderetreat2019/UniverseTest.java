package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniverseTest {
    @Test
    public void emptyGrid() {
        Universe g = new Universe();

        assertEquals(0, g.getSize());
    }

    @Test
    public void singleCellGrid() {
        Universe g = new Universe();

        g.createCell(new Coordinate(0, 1, 2));
        assertEquals(1, g.getSize());
    }

}
