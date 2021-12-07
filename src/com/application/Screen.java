package com.application;

import java.util.Random;

public class Screen {

    public static final int SCREEN_HEIGHT = 20;
    public static final int SCREEN_WIDTH = 20;

    Cell[][] field = new Cell[SCREEN_HEIGHT][SCREEN_WIDTH];

    public Screen() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
                Random r = new Random();
                boolean isAlive = r.nextBoolean();
                field[i][j] = new Cell(i, j, false);
            }
        }
    }

    void print() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
             Cell current = field[i][j];
                System.out.print(current.printChar() + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        System.out.println("******************");
    }

    void simulateNextTurn(){

    }
}
