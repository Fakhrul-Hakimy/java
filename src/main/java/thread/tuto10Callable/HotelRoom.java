/**
 * 🧠 What is Callable in Java?
 *
 * - `Callable<V>` is a functional interface in Java (java.util.concurrent).
 * - Similar to `Runnable`, but with key differences:
 *     1. It **returns a result** (of type V).
 *     2. It can **throw checked exceptions**.
 *
 * ✅ Typical usage:
 * - Used for tasks that need to run in a separate thread and return a value.
 * - Commonly used with `ExecutorService.submit(Callable)` which returns a `Future<V>`.
 *
 * 🔧 With `Future<V>`:
 * - You use `.get()` on the Future to retrieve the result of the task once it's completed.
 * - `.get()` blocks the current thread until the result is available.
 *
 * In this example:
 * - Each `HotelRoom` simulates a task that returns a random price.
 * - We submit the task to an executor and retrieve the result via Future.
 */

package thread.tuto10Callable;

import java.util.concurrent.*;

public class HotelRoom implements Callable<Double> {

    // Simulate a hotel price calculation task
    @Override
    public Double call() throws Exception {
        return Math.random() * 1000; // Return a random hotel price
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Create an instance of the Callable task
        HotelRoom room = new HotelRoom();

        // Create a thread pool with 8 threads
        ExecutorService service = Executors.newFixedThreadPool(8);

        // Submit the task 3 times and retrieve results using Future
        for (int i = 0; i < 3; i++) {
            // Submit the callable to the executor service
            Future<Double> v = service.submit(room);

            // Get the result from the Future (blocking)
            System.out.printf("Hotel %d : $%.2f\n", (i + 1), v.get());
        }

        // Shutdown the executor to release resources
        service.shutdown();
    }
}
