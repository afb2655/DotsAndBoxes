package game;

public class Box {

    private Line bottom;
    private int column;
    private Line left;
    private Player owner;
    private Line right;
    private int row;
    private Line top;


    public Box(int column, int row, Line Lines;) {
        this.column = column;
        this.row = row;
    }

    public Player getOwner() {

        return owner;
    }

    public void claim(Player owner){
        this.owner = owner;
    }



}
