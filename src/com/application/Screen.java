package com.application;

public class Screen {

    public static final int SCREEN_HEIGHT = 20;
    public static final int SCREEN_WIDTH = 20;

    Cell[][] field = new Cell[SCREEN_HEIGHT][SCREEN_WIDTH];

    public Screen() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
 //               System.out.println("i -- " + i);
  //              System.out.println("j -- " + j);
                field[i][j] = new Cell(i, j, false);
            }
        }
    }

    void print() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
             Cell current = field[i][j];
                System.out.println(current.printChar());
            }
        }
    }
}
