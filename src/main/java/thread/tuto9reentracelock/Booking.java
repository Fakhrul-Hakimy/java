package thread.tuto9reentracelock;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 🧠 What is ReentrantLock?
 * -------------------------
 * - ReentrantLock is an advanced thread synchronization mechanism in Java.
 * - It works like the 'synchronized' keyword but provides more control over locking.
 * - It allows the same thread to acquire the lock multiple times (re-entrance), and it must release it the same number of times.
 * - Useful when:
 *     • You want to try acquiring a lock without blocking (tryLock).
 *     • You need fairness (first-come-first-served).
 *     • You need to interrupt waiting threads.
 *
 * ✅ In this example:
 * - ReentrantLock ensures that only one thread can access the seat booking logic at a time.
 * - The lock is shared (static) so all threads compete for the same lock.
 */

public class Booking extends Thread {

    // Shared set to store booked seat numbers
    private static final Set<Integer> bookedSeats = new HashSet<>();

    // ReentrantLock used for thread-safe booking (with fairness = true)
    private static final ReentrantLock lock = new ReentrantLock(true);

    int seat;
    String CounterName;

    // Constructor to initialize the seat and counter name
    Booking(int seat, String CounterName) {
        this.seat = seat;
        this.CounterName = CounterName;
    }

    @Override
    public void run() {
        // Lock the critical section
        lock.lock();
        try {
            if (!bookedSeats.contains(seat)) {
                bookedSeats.add(seat);
                System.out.println(CounterName + " : Seat " + seat + " has been Booked.");
            } else {
                System.out.println(CounterName + " : Seat " + seat + " cannot be Booked.");
            }
        } finally {
            // Always release the lock to avoid deadlock
            lock.unlock();
        }
    }
}
