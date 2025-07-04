package thread;

// ✅ Rename class to avoid conflict with Thread.sleep() method
public class SleepExample extends Thread {

    // Override the run() method to define what the thread should do
    @Override
    public void run() {
        // Loop 10 times (prints one dot per second)
        for (int i = 0; i < 10; i++) {
            System.out.print(".");

            try {
                // Pause the current thread for 1000 milliseconds (1 second)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // If the thread is interrupted during sleep, this block runs
                System.out.println("\nThread was interrupted!");
                break; // Exit the loop if interrupted
            }
        }
    }

    public static void main(String[] args) {
        // Create a new instance of the thread class
        SleepExample thread = new SleepExample();

        // Start the thread — this will call the run() method in a new thread
        thread.start();
    }
}
