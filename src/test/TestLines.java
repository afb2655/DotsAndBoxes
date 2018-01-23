package test;

import game.Dot;
import game.Line;
import game.Lines;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * A test unit for the game.Lines class.
 *
 * @author Sean Strout @ RIT CS
 */
public class TestLines {
    /** 2 rows */
    private final static int ROWS = 2;
    /** 3 columns */
    private final static int COLUMNS = 3;
    /** the collection of lines */
    private Lines lines;
    /** the collection of dots */
    private Dot[][] dots;

    @Before
    public void init() {
        // create the dots
        this.dots = new Dot[ROWS+1][COLUMNS+1];
        for (int row=0; row<=ROWS; ++row) {
            for (int column=0; column<=COLUMNS; ++column) {
                this.dots[row][column] = new Dot(row, column);
            }
        }

        // create the lines
        this.lines = new Lines(ROWS, COLUMNS, this.dots);
    }

    @Test
    public void verifyLines() {
        // verify number of lines
        assertEquals(2*(ROWS+1)*(COLUMNS+1) - (ROWS+1) - (COLUMNS+1), this.lines.size());

        // check for a line that can't be found
        assertNull(this.lines.getLine(0, 1, 0, 0));

        // check for all lines that should exist
        for (int row=0; row<=ROWS; ++row) {
            for (int column=0; column<=COLUMNS; ++column) {
                // horizontal
                if (column<COLUMNS) {
                    assertEquals(new Line(new Dot(row, column), new Dot(row, column+1)),
                            this.lines.getLine(row, column, row, column+1));
                }

                // vertical
                if (row<ROWS) {
                    assertEquals(new Line(new Dot(row, column), new Dot(row+1, column)),
                    this.lines.getLine(row, column, row+1, column));
                }
            }
        }
    }
}
