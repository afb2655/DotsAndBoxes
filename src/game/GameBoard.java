/**
 * this is way too hard I couldn't even finish this.
 */
package game;

public class GameBoard {
    private int blueScore;
    private Box[][] boxes;
    private int columns;
    private Dot[][] dots;
    private Lines lines;
    private int moves;
    private Player player;
    private int redScore;
    private int rows;

    public GameBoard(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public boolean gameOver(){
    return false;
    }

    public boolean isLineValid(int row1, int column1, int row2, int column2) {
        if (lines.getLine(row1, column1, row2, column2) != null) {
            if (lines.getLine(row1, column1, row2, column2).hasOwner() == true){
                return true;
            }
        }
        return false;
    }

    public void makeMove(int row1, int column1, int row2, int column2){

    }

    public String toString() {
    return "this lab is too hard";
    }

    public Player whoseTurn() {
    return this.player;
    }

}
