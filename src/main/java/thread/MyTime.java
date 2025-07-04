package thread;

import org.apache.commons.lang3.time.*;
import java.util.Scanner;
public class MyTime {

    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of x : ");
        int x=scanner.nextInt();
        MyDecrement thread1= new MyDecrement(x);
        MyIncrement thread2= new MyIncrement(x);
        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
            // Do nothing — just wait until both threads are done
        }
        stopWatch.stop();




        System.out.println("Time taken: " + stopWatch.getTime() + " milliseconds");

    }
}
