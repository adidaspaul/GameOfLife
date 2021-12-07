package com.application;

public class Cell {
    public static char ALIVE_CELL = '0';
    public static char DEAD_CELL = '-';

    protected boolean isAlive;
    protected int x;
    protected int y;
    protected int proximityCount;

    public char printChar(){
        if(isAlive) {
            return ALIVE_CELL;
        } else
            return DEAD_CELL;
    }

    public Cell(int x, int y, boolean isAlive) {
    }
}
