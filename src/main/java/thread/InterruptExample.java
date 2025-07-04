package thread;

/**
 * 🔄 Sleeping and Interrupting Thread Example
 *
 * This example shows how to:
 * ✅ Use Thread.sleep() to pause a thread
 * ✅ Use interrupt() to send an interrupt signal
 * ✅ Detect interruptions with isInterrupted()
 */
public class InterruptExample implements Runnable {

    @Override
    public void run() {
        // Simple loop that counts from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // 🔔 Check if the thread was interrupted before continuing
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("\n❗ Thread was interrupted! Exiting loop.");
                break;
            }

            System.out.println("🧮 Counting: " + i);

            try {
                Thread.sleep(1000); // ⏱️ Pause 1 second
            } catch (InterruptedException e) {
                // This will catch an interrupt during sleep
                System.out.println("\n💥 Thread was interrupted during sleep!");
                // Optional: break or re-interrupt if needed

            }
        }

        System.out.println("✅ Thread finished.");
    }

    public static void main(String[] args) {
        InterruptExample task = new InterruptExample();
        Thread thread = new Thread(task, "CounterThread");
        thread.start(); // 🚀 Start the new thread

        try {
            Thread.sleep(3000); // Let the thread count for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🔧 Main thread sending interrupt signal...");
        thread.interrupt(); // ⚠️ Interrupt the thread

        try {
            Thread.sleep(2000); // Main thread sleeps again
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("🔁 Sending second interrupt...");
        thread.interrupt(); // Optional second interrupt (has no effect if thread already exited)
    }
}
