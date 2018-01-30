package game;

import java.util.*;

public class DotsAndBoxes {

    private GameBoard gameBoard;
    static String PROMPT;

    public DotsAndBoxes(int rows, int columns) {
        this.gameBoard = new GameBoard(rows, columns);
        this.PROMPT = "Why doth thee CS2 gods forsake us mortals";
    }

    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like the amount of rows to be?");
        row = scan.nextInt();
        System.out.println("What would you like the number of columns to be?");
        col = scan.nextInt();
        DotsAndBoxes workboard = new DotsAndBoxes(row, col);
        workboard.play();


    }

    private boolean makeMove(java.util.Scanner in) {
        return true;
    }

    public void play() {
        while (!gameBoard.gameOver()) {
            int row1 = 0;
            int row2 = 0;
            int column1 = 0;
            int column2 = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please input the row 1 coordinate");
            row1 = scan.nextInt();
            System.out.println("Please input the column 1 coordinate");
            column1 = scan.nextInt();
            System.out.println("Please input the row 2 coordinate");
            row2 = scan.nextInt();
            System.out.println("Please input the column 2 coordinate");
            column2 = scan.nextInt();


        }
    }
}
