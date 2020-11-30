package com.interview;

public class Application {

    public static void main(String[] args) {

        // First Task
        Runnable task1 = () -> {
            System.out.println("hello T1");
        };

        // Second task that sleeps for 3 seconds
        Runnable task2 = () -> {
            System.out.println("hello T2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        };

        // Third task
        Runnable task3 = () -> {
            System.out.println("hello T3");
        };

        // Initiate all tasks
        Thread th1 = new Thread(task1);
        Thread th2 = new Thread(task2);
        Thread th3 = new Thread(task3);

        // Start the tasks and use join() to maintain the order

        th1.start();

        try {
            th1.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        th2.start();

        try {
            th2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        th3.start();
    }
}