package game;

/**
 * Represents a single dot in the game of Dots and Boxes.  A dot is uniquely
 * defined by a row and column coordinate.
 * asdasd
 * @author YOUR NAME HERE
 */
public class Dot {
    /**
     * Create the dot.
     *
     * @param row the row
     * @param column the column
     * @rit.pre row and column are greater than or equal to 0
     */

    private int row;
    private int column;


    public Dot(int row, int column) {

    }

    /**
     * Get the row.
     *
     * @return the row
     */
    public int getRow() {
        return this.row; }

    /**
     * Get the column.
     *
     * @return the column
     */
    public int getColumn() {
        return this.column; }

    /**
     * Return the string representation of a dot.  Don't get too excited,
     * it's just a dot. :P
     *
     * @return a dot
     */
    @Override
    public String toString() {
        return("("+this.row+","+" "+this.column+")"); }

    /**
     * Two dots are equal if they have the same row and column.
     *
     * @param other the dot to compare with
     * @return whether they are equal or not
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Dot) {
            if (this.row == ((Dot) other).row && this.column == ((Dot) other).column) {
                return true;
            }
            else {
                return false;
            }

            }
            else {
            return false;
        }
        }
    }

