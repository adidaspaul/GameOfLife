package com.application;

public class GameOfLife {

    public static void main(String[] args) throws InterruptedException {
        Screen q = new Screen();

        while (true) {
            q.simulateNextTurn();
            q.print();
            Thread.sleep(1000);
        }

    }
}
