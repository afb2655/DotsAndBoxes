package game;

public class Line {



    private Dot First;
    private Dot Second;
    private Player claim;


    public void setClaim(Player claim) {
        this.claim = claim;
    }


    public Player getClaim() {
        return this.claim;
    }

    public String hasOwner() {
        return (this.claim.getLabel());
    }

    public Player getOwner() {
        return (this.claim);
    }


    public Line(Dot dot, Dot dot1) {
        First = dot;
        Second = dot1;
    }

    public Dot getFirst() {
        return First;
    }

    public void setFirst(Dot first) {
        First = first;
    }

    public Dot getSecond() {
        return Second;
    }

    public void setSecond(Dot second) {
        Second = second;
    }
}
