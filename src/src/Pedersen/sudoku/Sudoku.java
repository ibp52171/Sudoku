package Pedersen.sudoku;

import java.util.Random;

public class Sudoku {

    public int [][] board;

    public Sudoku() {

        board = new int[][]{

            {7, 9, 0, 0, 0, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 6, 9, 0, 0},
            {8, 0, 0, 0, 3, 0, 0, 7, 6},
            {0, 0, 0, 0, 0, 5, 0, 0, 2},
            {0, 0, 5, 4, 1, 8, 7, 0, 0},
            {4, 0, 0, 7, 0, 0, 0, 0, 0},
            {6, 1, 0, 0, 9, 0, 0, 0, 8},
            {0, 0, 2, 3, 0, 0, 0, 0, 0},
            {0, 0, 9, 0, 0, 0, 0, 5, 4}
        };

    }

}
