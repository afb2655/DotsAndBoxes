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
