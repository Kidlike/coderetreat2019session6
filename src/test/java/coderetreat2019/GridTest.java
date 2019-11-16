package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {
    @Test
    public void emptyGrid() {
        Grid g = new Grid();

        assertEquals(0, g.getSize());
    }

    @Test
    public void singleCellGrid() {
        Grid g = new Grid();

        g.createCell(new Coordinate(0, 1));

        assertEquals(1, g.getSize());
    }
}
