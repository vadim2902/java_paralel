package com.company;

public class MainThread extends Thread {
    private final int id;
    private final BreakThread breakThread;
    private final long maxDurationMillis; // Максимальний час виконання

    public MainThread(int id, BreakThread breakThread, long maxDurationMillis) {
        this.id = id;
        this.breakThread = breakThread;
        this.maxDurationMillis = maxDurationMillis;
    }

    @Override
    public void run() {
        long sum = 0;
        long count = 0; // Лічильник додавань
        long endTime = System.currentTimeMillis() + maxDurationMillis;

        while (System.currentTimeMillis() < endTime && !breakThread.isCanBreak()) {
            sum++;
            count++; // Збільшуємо лічильник на кожному кроці
            try {
                Thread.sleep(1); // Маленька затримка, щоб уникнути надмірного завантаження процесора
            } catch (InterruptedException e) {
                System.out.println("Thread " + id + " interrupted.");
                break;
            }
        }
        // Виведення інформації про потік
        System.out.println("Thread ID: " + id + " - Sum: " + sum + " - Count: " + count);
    }
}
