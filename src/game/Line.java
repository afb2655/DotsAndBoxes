package game;

public class Line {


    private java.util.ArrayList<Box> boxes;
    public static String EMPTY;
    private Dot first;
    public static String HORI_LINE;
    private Player owner;
    private Dot second;
    public static String VERT_LINE;


    public Line(Dot first, Dot second) {
        this.first = first;
        this.second = second;
    }

    public boolean equals(Object other){
        if (other instanceof Line){
            if (this.owner.equals(((Line) other).owner)) {
                if ((this.first.equals(((Line) other).first) && this.second.equals(((Line) other).second)) || this.first.equals(((Line) other).second) && this.second.equals(((Line) other).first)) {
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
        else {
            return false;
        }
    }

    public void claim(Player owner){
        this.owner = owner;
    }

    public java.util.ArrayList<Box> getboxes(){
        return(boxes);
    }

    public Player getOwner(){
        return (this.owner);
    }

    public Dot getFirst() {
        return first;
    }

    public Dot getSecond() {
        return second;
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
        return "changeme";

    }

}
