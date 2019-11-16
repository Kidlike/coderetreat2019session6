package coderetreat2019;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GridTest {
    @Test
    public void emptyGrid() {
        Grid g = new Grid();

        assertEquals(0, g.getSize());
    }
}
