package thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 🧠 This program demonstrates the use of CyclicBarrier in Java.
 *
 * A CyclicBarrier is used when multiple threads must wait for each other to reach a common point (the barrier)
 * before continuing. It is called "cyclic" because it can be reused after all threads reach the barrier.
 *
 * In this example:
 * - We create a CyclicBarrier for 3 threads.
 * - All 3 threads must call barrier.await() to pass the barrier.
 * - Once all threads reach the barrier, a barrier action prints "All thread arrive at barrier".
 */
public class CycBarrier implements Runnable {
    private final CyclicBarrier barrier;

    // Constructor receives the CyclicBarrier instance
    public CycBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            // Each thread prints a message and waits at the barrier
            System.out.println(Thread.currentThread().getName() + ": Arrive at barrier");

            // Wait until all parties (threads) reach this point
            barrier.await();

            // Once the barrier is passed, this line will be executed
            System.out.println(Thread.currentThread().getName() + ": Barrier has crossed");

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // Create a CyclicBarrier that waits for 3 threads
        // When all 3 threads reach the barrier, this Runnable will run
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("All thread arrive at barrier");
            }
        });

        // Create and start 3 threads that will reach the barrier
        Thread thread1 = new Thread(new CycBarrier(cb));
        Thread thread2 = new Thread(new CycBarrier(cb));
        Thread thread3 = new Thread(new CycBarrier(cb));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
