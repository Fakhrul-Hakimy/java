package thread.tuto11CountDown;

import java.util.concurrent.CountDownLatch;
/**
 * 🧠 This program demonstrates CountDownLatch in Java.
 *
 * - 3 worker threads represent student tasks: quiz, assignment, groupProject.
 * - The main thread waits until all 3 tasks finish using latch.await().
 * - Each thread sleeps for a random time and then counts down the latch.
 *
 * ✅ This is useful when:
 *    - You want to wait for multiple threads to complete before proceeding.
 *    - You need to ensure a task runs only *after* others are done.
 *
 * Real-world example: Wait for 3 APIs to return before combining the result.
 */


public class Main {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        WorkerThread quiz= new WorkerThread(latch);
        quiz.setName("Quiz");
        WorkerThread assignment= new WorkerThread(latch);
        assignment.setName("assignment");
        WorkerThread groupProject= new WorkerThread(latch);
        groupProject.setName("groupProject");

        groupProject.start();
        quiz.start();
        assignment.start();

        try{
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All assignment has been complete.");
        System.out.println("Calculating final mark");

    }
}
