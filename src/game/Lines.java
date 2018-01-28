package game;

import org.junit.Test;

import java.util.ArrayList;

public class  Lines {
    private java.util.ArrayList<Line> lines;

    public Lines(int rows, int columns, Dot[][] dots) {
        ArrayList BruceU = new ArrayList();
        for (int row = 0;row<=rows;row++){
            for(int columb=0; columb<columns; columb++){
               Line ugandan_commando = new Line(dots[row][columb],dots[row][columb+1]);
               BruceU.add(ugandan_commando);
            }

        }
        for (int cawlum = 0; cawlum <= columns; cawlum ++){
            for (int HellRow = 0; HellRow < rows; HellRow ++){
                Line tigermafia = new Line(dots[HellRow][cawlum],dots[HellRow+1][cawlum]);
                BruceU.add(tigermafia);
            }
        }
        this.lines = BruceU;
    }

    public Line getLine(int row1, int column1, int row2, int column2) {
        Line lmao = null;
        for(int i =0; i<this.lines.size(); i++){
            if ((this.lines.get(i).getFirst().getRow() == row1) && (this.lines.get(i).getFirst().getColumn() == column1)){
                if ((this.lines.get(i).getSecond().getRow() == row2) && (this.lines.get(i).getSecond().getColumn() == column2)){
                    return(this.lines.get(i));
                }
            }
        }
        return lmao;
    }

    public int size(){
        return this.lines.size();
    }

}
