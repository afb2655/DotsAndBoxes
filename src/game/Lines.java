package game;

import java.util.ArrayList;

public class  Lines {
    private java.util.ArrayList<Line> lines;

    public Lines(int rows, int columns, Dot[][] dots) {
        for (int row = 0;row<=rows;row++){
            for(int c=0; c<=columns; c++){

            }

        }
    }

    public Line getLine(int row1, int column1, int row2, int column2) {
        return this.lines.get(row1);
    }

    public int size(){
        return this.lines.size();
    }

}
