package coderetreat2019;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    Set<Coordinate> cells = new HashSet<>();

    public int getSize() {
        return cells.size();
    }

    public void createCell(Coordinate coordinate) {
        cells.add(coordinate);
    }
}
