package game;

public class Box {

    private Line bottom;
    private int column;
    private Line left;
    private Player owner;
    private Line right;
    private int row;
    private Line top;


    public Box(int column, int row, Line Lines) {
        this.column = column;
        this.row = row;
    }


    public Player getOwner() {

        return owner;
    }

    public void claim(Player owner){
        this.owner = owner;
    }

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
                }

            }
        }
    }


}
