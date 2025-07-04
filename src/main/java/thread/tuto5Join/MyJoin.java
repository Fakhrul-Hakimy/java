package thread.tuto5Join;

import java.util.Scanner;

/**
 * 🧵 This class demonstrates how to use threads and the `join()` method in Java.
 *
 * ✅ Learning Points:
 * - Create and run multiple threads (thread1, thread2, thread3)
 * - Use `join()` to wait for one thread to finish before starting the next
 * - Use custom logic inside each thread (e.g., summing, checking prime)
 * - Combine results from all threads to get a final total
 */
public class MyJoin {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // 🧮 Ask the user to enter a number that will be passed to all threads
        System.out.print("Enter a number : ");
        int x = scanner.nextInt();

        // 🧵 Create instances of custom thread classes, each with logic based on 'x'
        thread1 mythread1 = new thread1(x);
        thread1 mythread4 = new thread1(x);// Assume: does some math, returns a total
        thread2 mythread2 = new thread2(x); // Assume: does something else (e.g., sum range)
        thread3 mythread3 = new thread3(x); // Assume: finds primes

        // ▶️ Start thread2 first and wait for it to complete using join()
        mythread2.start();
        mythread2.join(); // Wait until thread2 finishes before moving to thread3

        // ▶️ Then start thread3 and wait for it to finish
        mythread3.start();
        mythread3.join();

        // ▶️ Finally, start thread1 and wait for it to complete
        mythread1.start();
        mythread1.join();

        // ➕ Add up the total values calculated by all threads and display the result
        System.out.println("Total is : " + (mythread2.total + mythread3.total + mythread1.total));
    }
}
