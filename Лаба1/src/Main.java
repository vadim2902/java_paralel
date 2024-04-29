package com.company;

public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        new MainThread(1, breakThread, 5000).start(); 
        new MainThread(2, breakThread, 10000).start();
        new MainThread(3, breakThread, 15000).start();
       // new MainThread(4, breakThread, 20000).start();
       // new MainThread(5, breakThread, 25000).start();
        // new MainThread(6, breakThread, 30000).start();
        new Thread(breakThread).start(); 
    }
}
