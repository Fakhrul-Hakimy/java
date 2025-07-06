package thread.tuto16;

public class App implements Runnable {

    private static final Object AccountAli = new Object();
    private static final Object AccountBadrul = new Object();

    private final boolean lockAliFirst;

    // Constructor to determine lock order
    public App(boolean lockAliFirst) {
        this.lockAliFirst = lockAliFirst;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new App(true), "Thread-1");   // Lock Ali → Badrul
        Thread thread2 = new Thread(new App(false), "Thread-2");  // Lock Badrul → Ali
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        if (lockAliFirst) {
            synchronized (AccountAli) {
                System.out.println(Thread.currentThread().getName() + " locked Ali");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                System.out.println(Thread.currentThread().getName() + " trying to lock Badrul");
                synchronized (AccountBadrul) {
                    System.out.println(Thread.currentThread().getName() + " locked Badrul");
                }
            }
        } else {
            synchronized (AccountBadrul) {
                System.out.println(Thread.currentThread().getName() + " locked Badrul");
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                System.out.println(Thread.currentThread().getName() + " trying to lock Ali");
                synchronized (AccountAli) {
                    System.out.println(Thread.currentThread().getName() + " locked Ali");
                }
            }
        }
    }
}