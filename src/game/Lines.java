/**
 * Author: Aiden Buchheister
 */


package game;

import org.junit.Test;

import java.util.ArrayList;

public class  Lines {
    private java.util.ArrayList<Line> lines;

    /**
     * Constructs the ArrayList of Lines using muh double for loop algorithms
     * using BRUCE-U AND THE TIGER MAFIA, COMMANDO, COMMANDOOOOOOOOOOO
     * Also whoever is reading this should really watch "Who killed captain alex" It's this hilarious ultra low budget
     * ($200) Ugandan action movie, like its hilarious, and the knuckles meme is based on it
     * @param rows the rows in the game to construct the line with
     * @param columns the # of columns to construct
     * @param dots the 2d array of dots and columns
     */
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

    /**
     * gets a line from the arraylist of lines
     * @param row1 the first row coordinate
     * @param column1 the first column coordinate
     * @param row2 the 2nd row coordinate
     * @param column2 the 2nd column coordinate
     * @return returns a line
     */
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

    /**
     * gets the size of the arraylist
     * @return returns the size boi
     */
    public int size(){
        return this.lines.size();
    }

}
