package game;

public class Line {


    private java.util.ArrayList<Box> boxes;
    static String EMPTY;
    private Dot first;
    static String HORI_LINE;
    private Player owner;
    private Dot second;
    static String VERT_LINE;


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

    public Dot getFirst() {
        return first;
    }

    public void setFirst(Dot First) {
        first = First;
    }

    public Dot getSecond() {
        return second;
    }

    public void setSecond(Dot Second) {
        second = Second;
    }
}
