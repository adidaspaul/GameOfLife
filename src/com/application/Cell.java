package com.application;

public class Cell {
    public static char ALIVE_CELL = '0';
    public static char DEAD_CELL = '-';

    boolean alive;
    int x;
    int y;

    public char printChar(){
        if(alive) {
            return ALIVE_CELL;
        } else
            return DEAD_CELL;
    }

    public Cell(int x, int y, boolean alive) {
        this.x = x;
        this.y = y;
        this.alive = alive;
    }
}
