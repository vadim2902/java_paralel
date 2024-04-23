package com.company;

public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        new MainThread(1, breakThread, 5000).start(); // Кожен потік працює 10 секунд
        new MainThread(2, breakThread, 10000).start();
        new MainThread(3, breakThread, 15000).start();

        new Thread(breakThread).start(); // Управляючий потік
    }
}