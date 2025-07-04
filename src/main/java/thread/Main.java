package thread;

/*
 * This program demonstrates how to use Thread.currentThread() in Java.
 * It retrieves and displays information about the currently executing thread,
 * and shows how to create and start threads using both:
 *    - A class that extends Thread
 *    - A class that implements Runnable
 *
 * 🧠 Learning Points:
 * - Every Java program starts with a main thread that runs the main() method.
 * - Thread.currentThread() returns a reference to the currently executing thread.
 * - You can use this reference to access or modify thread properties like:
 *      • getId()       → Returns the thread's unique ID
 *      • getName()     → Returns the thread's name
 *      • getPriority() → Returns the thread's priority (default is 5)
 *      • toString()    → Returns a string representation of the thread
 *
 * ✅ Other useful methods of currentThread():
 *      • setName(String name)       → Set a custom name for the thread
 *      • setPriority(int priority)  → Set a new priority (1–10)
 *      • isAlive()                  → Check if thread is running
 *      • isDaemon()                 → Check if it's a daemon (background) thread
 *      • sleep(long ms)             → Pause thread execution temporarily
 */

public class Main {

    public static void main(String[] args)  {
        // Get the current thread's ID
        long id = Thread.currentThread().getId();

        // Get the current thread's name
        String name = Thread.currentThread().getName();

        // Get the current thread's priority (default is 5, range is 1 to 10)
        int priority = Thread.currentThread().getPriority();

        // Get the full string description of the thread
        String toString = Thread.currentThread().toString();

        // Display main thread information
        System.out.println("Thread id : " + id);
        System.out.println("Thread Name : " + name);
        System.out.println("Thread Priority : " + priority);
        System.out.println(toString);

        // Create a thread using a class that EXTENDS Thread
        myThread thread1 = new myThread();
        thread1.setName("myThreads");

        // Create an instance of a class that IMPLEMENTS Runnable
        myRunnable runnable = new myRunnable();

        // Pass the Runnable instance into a Thread constructor
        Thread thread2 = new Thread(runnable, "runnableThread");

        // Start both threads
        thread1.start();   // This runs the code inside myThread's run() method
        thread2.start();   // This runs the code inside myRunnable's run() method
    }
}
