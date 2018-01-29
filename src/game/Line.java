package game;

import java.util.ArrayList;

public class Line {




    private java.util.ArrayList<Box> boxes;
    public static final String EMPTY =" ";
    private Dot first;
    public static final String HORI_LINE = "-";
    private Player owner;
    private Dot second;
    public static String VERT_LINE = "|";


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


    public void claim(Player owner){
        this.owner = owner;
        for(int i =0; i<boxes.size(); i++){
            boxes.get(i).claim(owner);
        }
    }


    public void setBox(Box box){
        this.boxes.add(box);
    }


    public java.util.ArrayList<Box> getboxes(){

        return(boxes);
    }

    public Player getOwner(){
        return (this.owner);
    }

    public Dot getFirst() {
        return this.first;
    }

    public Dot getSecond() {
        return this.second;
    }

    public  boolean hasOwner(){
        if (this.owner.getLabel() == " ") {
            return false;
        } else{
            return true;
        }
        }
//        for( int i=0; i<this.boxes.size();i++){
//            if this.boxes(i) ==
//        }



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
