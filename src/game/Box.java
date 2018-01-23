package game;

public class Box {

    private Line TopLine;
    private Line BottomLine;
    private Line RightLine;

    public Player getOwner() {
        return Owner;
    }

    public void setOwner(Player owner) {
        Owner = owner;
    }

    private Player Owner;

    public Line getTopLine() {
        return TopLine;
    }

    public void setTopLine(Line topLine) {
        TopLine = topLine;
    }

    public Line getBottomLine() {
        return BottomLine;
    }

    public void setBottomLine(Line bottomLine) {
        BottomLine = bottomLine;
    }

    public Line getRightLine() {
        return RightLine;
    }

    public void setRightLine(Line rightLine) {
        RightLine = rightLine;
    }

    public Line getLeftLine() {
        return LeftLine;
    }

    public void setLeftLine(Line leftLine) {
        LeftLine = leftLine;
    }

    private Line LeftLine;

}
