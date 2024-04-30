package com.company;

public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();
        int numberOfThreads = 3; 
        long[] durations = {5000, 10000, 15000}; 

        if (numberOfThreads == durations.length) {
            for (int i = 0; i < numberOfThreads; i++) {
                new MainThread(i + 1, breakThread, durations[i]).start();
            }

            new Thread(breakThread).start(); /
        } else {
            System.out.println("Кількість потоків не співпадає з кількістю тривалостей виконання.");
        }
    }
}
