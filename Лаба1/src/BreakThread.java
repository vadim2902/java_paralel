package com.company;

public class BreakThread implements Runnable {
    private volatile boolean canBreak = false;

    @Override
    public void run() {
        try {
            Thread.sleep(30 * 1000); // Потік спить 30 секунд перед оновленням canBreak
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        canBreak = true;
    }

    public synchronized boolean isCanBreak() {
        return canBreak;
    }
}