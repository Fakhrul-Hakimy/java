package thread.tuto5Join;

public class thread1 extends Thread {

    int x;
    int  total=0;

    thread1(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = x; i < (x + 5); i++) {
            if (i <= 1) continue; // skip non-primes

            boolean isPrime = true;

            for (int y = 2; y <= Math.sqrt(i); y++) {
                if (i % y == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                total=total+i;
            }
        }
    }
}
