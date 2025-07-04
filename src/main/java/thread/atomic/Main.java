package thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Thread {
    static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        while (counter.get() < 10) {

            int before = counter.incrementAndGet();
            System.out.println(Thread.currentThread().getName() + " - Counter: " + before);
        }
    }

    public static void main(String[] args) {
        Main t1 = new Main();
        Main t2 = new Main();
        t1.start();
        t2.start();
    }
}

