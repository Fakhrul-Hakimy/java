package project;

import java.util.Scanner;
import org.apache.commons.lang3.time.StopWatch;

class Counter {
    private int value = 0;

    public synchronized void increment() {
        value++;
    }

    public synchronized void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}

class ThreadForIncrement extends Thread {
    private Counter counter;
    private int x;

    public ThreadForIncrement(Counter counter, int x) {
        this.counter = counter;
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < x; i++) {
            counter.increment();
        }
    }
}

class ThreadForDecrement extends Thread {
    private Counter counter;
    private int x;

    public ThreadForDecrement(Counter counter, int x) {
        this.counter = counter;
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < x; i++) {
            counter.decrement();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input x: ");
        int x = scanner.nextInt();
        scanner.close();

        Counter counter = new Counter();
        StopWatch stopwatch = new StopWatch();

        stopwatch.start();

        Thread incrementThread = new ThreadForIncrement(counter, x);
        Thread decrementThread = new ThreadForDecrement(counter, x);

        incrementThread.start();
        try {
            incrementThread.join(); // Wait for increment thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        decrementThread.start();
        try {
            decrementThread.join(); // Wait for decrement thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopwatch.stop();

        System.out.println("Result: " + counter.getValue());
        System.out.println("Execution Time: " + stopwatch.getTime() + " milliseconds");
    }
}
