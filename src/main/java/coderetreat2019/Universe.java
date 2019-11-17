package coderetreat2019;

import java.util.HashSet;
import java.util.Set;

public class Universe {
    Set<Cell> cells = new HashSet<>();

    public int getSize() {
        return cells.size();
    }

    public void createCell(Cell coordinate) {
        cells.add(coordinate);
    }

    public void tick() {
        Set<Cell> cells = new HashSet<>();

        for (Cell cell: this.cells) {
            if (cell.staysAlive()) {
                cells.add(cell);
            }
        }

        this.cells = cells;
    }

}
