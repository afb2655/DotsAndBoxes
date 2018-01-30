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
        if (this.moves == this.lines.size()){
            return true;
        }
        return false;
    }

    public boolean isLineValid(int row1, int column1, int row2, int column2) {
        if (lines.getLine(row1, column1, row2, column2) != null) {
            if (lines.getLine(row1, column1, row2, column2).hasOwner() == false){
                return true;
            }
        }
        return false;
    }

    public void makeMove(int row1, int column1, int row2, int column2){

        if (isLineValid(row1,column1,row2,column2)){
            lines.getLine(row1,column1,row2,column2).claim(this.player);
        }
        this.moves ++;
    }

    public String toString() {
    return "this lab is too hard";
    }

    public Player whoseTurn() {
        if (moves%2 == 0) {
            return Player.RED;
        }
        if (moves%2 == 1){
        return Player.BLUE;
        }
            return this.player;
        }

    }
    
