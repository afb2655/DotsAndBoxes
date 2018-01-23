package game;

public class Line {
    private Dot Start;
    private Dot End;

    public Player getClaim() {
        return claim;
    }

    public void claim(Player claim) {
        this.claim = claim;
    }

    private Player claim;

    public Line(Dot dot, Dot dot1) {
    }
}
