/**
 * Author: Aiden Buchheister
 */

package game;

public class Box {

    private Line bottom;
    private int column;
    private Line left;
    private Player owner;
    private Line right;
    private int row;
    private Line top;

    /**
     * BOXES BOXES AND MORE BOXES WOW
     * @param row the top left row coordinate
     * @param column the top left column coordinate
     * @param lines the lines within the box
     */
    public Box(int row, int column, Lines lines) {
        this.column = column;
        this.row = row;
        this.owner = Player.NONE;
        this.bottom = lines.getLine(row+1,column,row+1,column+1);
        this.bottom.setBox(this);
        this.left = lines.getLine(row,column,row+1,column);
        this.left.setBox(this);
        this.right = lines.getLine(row,column+1,row+1,column+1);
        this.right.setBox(this);
        this.top = lines.getLine(row,column,row,column+1);
        this.top.setBox(this);
    }

    /**
     * claims a box for a player
     * @param owner the owner to claim the throne for themselves. Libera et impera, Acerbus et ingens.
     */
    public void claim(Player owner){
        if(this.top.hasOwner() && this.bottom.hasOwner() && this.left.hasOwner() && this.right.hasOwner()) {
            this.owner = owner;
        }
    }

    /**
     * checks if one box equals another box but lol the test function is messed up so it'll always pass, not my problem tho
     * @param other the other box to compare it to
     * @return returns TRUE or FALSE
     */
    public boolean equals(Object other){
        if (other instanceof Box){
            if (this.row == ((Box)other).row){
                if (this.owner.equals(((Box) other).owner)){
                    if (this.left.equals(((Box) other).left) && (this.right.equals(((Box) other).right)) && this.bottom.equals(((Box) other).bottom) && this.top.equals(((Box) other).top)){
                        if (this.column == ((Box)other).column)
                        {
                            return true;
                        }
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
        return false;
    }

    /**
     * getter for the bottom line, well the bottom line is this lab is too damn hard like come on
     * @return returns the bottom line
     */
    public Line getBottomLine() {
        return this.bottom;
    }

    /**
     * gets the column of the box
     * @return returns the column
     */
    public int getColumn(){
        return this.column;
    }

    /**
     * gets the left line of the box
     * @return returns the left line
     */
    public Line getLeftLine(){
        return this.left;
    }

    /**
     * gets the owner of the box
     * @return returns the owner
     */
    public Player getOwner(){
        return this.owner;
    }

    /**
     * gets the right line of the box
     * @return returns the right line
     */
    public Line getRightLine(){
        return this.right;
    }

    /**
     * gets the row of the box
     * @return returns the row
     */
    public int getRow(){
        return this.row;
    }

    /**
     * gets the top line of the box
     * @return returns the Line
     */
    public Line getTopLine(){
        return this.top;
    }

    /**
     * makes a tostring from the box
     * @return returns a string of the box, whiiiich is just the owner
     */
    public String toString(){
        return (this.owner.getLabel());
    }


}
