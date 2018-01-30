/**
 * Author: Aiden Buchheister
 */

package game;

import java.util.ArrayList;

/**
 * Line is the line for the boxes and stuff, yo
 */
public class Line {




    private java.util.ArrayList<Box> boxes;
    public static final String EMPTY =" ";
    private Dot first;
    public static final String HORI_LINE = "-";
    private Player owner;
    private Dot second;
    public static String VERT_LINE = "|";

    /**
     * Line is the constructor for the Line class
     * @param first first is the first dot of the line
     * @param second second is the second dot of the line
     */
    public Line(Dot first, Dot second) {
        if ((second.getRow() - first.getRow() > 1 || (second.getColumn() - first.getColumn() > 1))){
            throw new AssertionError("Blyat those are wrong coordinates cyka");
        }
        assert first.getRow() <= second.getRow();
        assert first.getColumn() <= second.getColumn();
        this.first = first;
        this.second = second;
        this.owner = Player.NONE;
        this.boxes = new ArrayList();

    }

    /**
     * equals checks if one line is equal to another line
     * @param other other is the OTHER line to check with this
     * @return returns TRUE or FALSE
     */
    public boolean equals(Object other){
        if (other instanceof Line){
                if ((this.first.equals(((Line) other).first) && this.second.equals(((Line) other).second)) || (this.first.equals(((Line) other).second) && this.second.equals(((Line) other).first))) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            }
        }

    /***
     * claim claims a line for its owner, GLORY TO THE MOTHERLAND!
     * @param owner the owner to claim the box, either Glorious Russian or Gross Prussian
     */
    public void claim(Player owner){
        this.owner = owner;
        for(int i =0; i<boxes.size(); i++){
            boxes.get(i).claim(owner);
        }
    }

    /**
     * adds box
     * @param box adds a box to this.boxes
     */
    public void setBox(Box box){
        this.boxes.add(box);
    }

    /**
     * gets the owner of a line
     * @return returns the owner of the line
     */
    public Player getOwner(){
        return (this.owner);
    }

    /**
     * gets first point of the line
     * @return returns the first dot
     */
    public Dot getFirst() {
        return this.first;
    }

    /**
     * gets the second dot from a line
     * @return returns the second dot
     */
    public Dot getSecond() {
        return this.second;
    }

    /**
     * checks if the line has an owner
     * @return TRUE or FALSE
     */
    public  boolean hasOwner(){
        if (this.owner.getLabel() == " ") {
            return false;
        } else{
            return true;
        }
        }


    /**
     * makes a string outta the line
     * @return returns the string
     */
    public String toString(){
        if (this.owner == Player.NONE){
            return EMPTY;
        }
        if (this.first.getRow() == this.second.getRow()){
            return HORI_LINE;
        }
        if (this.first.getColumn() == this.second.getColumn()){
            return VERT_LINE;
        }
        return EMPTY;
    }

}
