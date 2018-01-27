package game;

public class Box {

    private Line bottom;
    private int column;
    private Line left;
    private Player owner;
    private Line right;
    private int row;
    private Line top;


    public Box(int column, int row, Lines lines) {
        this.column = column;
        this.row = row;
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
                    else{
                        return false;
                    }
                }
                else{
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
        return false;
    }

    public Line getBottomLine() {
        return this.bottom;
    }

    public int getColumn(){
        return this.column;
    }

    public Line getLeftLine(){
        return this.left;
    }

    public Player getOwner(){
        return this.owner;
    }

    public Line getRightLine(){
        return this.right;
    }

    public int getRow(){
        return this.row;
    }

    public Line getTopLine(){
        return this.top;
    }

    public String toString(){
        return (this.owner.getLabel());
    }


}
