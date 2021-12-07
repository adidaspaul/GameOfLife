package com.application;

import java.util.Random;
import java.util.stream.Stream;

public class Screen {

    public static final int SCREEN_HEIGHT = 20;
    public static final int SCREEN_WIDTH = 20;

    Cell[][] gameScreen = new Cell[SCREEN_HEIGHT][SCREEN_WIDTH];

    public Screen() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
                Random r = new Random();
                boolean alive = r.nextBoolean();
                gameScreen[i][j] = new Cell(i, j, false);
            }
        }
    }

    void print() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
                Cell current = gameScreen[i][j];
                System.out.print(current.printChar() + " ");
            }
            System.out.println();
        }
        System.out.println("******************");
        System.out.println("******************");
    }

    void simulateNextTurn() {
        for (int i = 0; i < SCREEN_HEIGHT; i++) {
            for (int j = 0; j < SCREEN_WIDTH; j++) {
                Cell current = gameScreen[i][j];

                long neighbor = countNeighbors(current, gameScreen);
                if (!current.alive && neighbor == 3) {
                    current.alive = true;
                } else if (current.alive && (neighbor == 3 || neighbor == 2)) {
                    current.alive = true;
                } else {
                    current.alive = false;
                }
            }
        }
    }

    private long countNeighbors(Cell cell, Cell[][] field) {
        int x = cell.x;
        int y = cell.y;

        var a = getCellByCoordinates(x - 1, y - 1, field);
        var b = getCellByCoordinates(x, y - 1, field);
        var c = getCellByCoordinates(x + 1, y - 1, field);

        var d = getCellByCoordinates(x - 1, y, field);
        var e = getCellByCoordinates(x + 1, y, field);

        var f = getCellByCoordinates(x - 1, y + 1, field);
        var g = getCellByCoordinates(x, y + 1, field);
        var h = getCellByCoordinates(x + 1, y + 1, field);

        return Stream.of(a, b, c, d, e, f, g, h)
                .filter(cc -> cc != null)
                .filter(cc -> cc.alive)
                .count();
    }

    private Cell getCellByCoordinates(int x, int y, Cell field[][]) {
        if (x < 0 || y < 0) {
            return null;
        }
        if (x >= SCREEN_WIDTH || y >= SCREEN_HEIGHT) {
            return null;
        } else
            return field[x][y];
    }
}
