package thread.tuto11CountDown;

import java.util.Random;
import java.util.concurrent.CountDownLatch;


public class WorkerThread extends Thread{

    private  final CountDownLatch latch;

    WorkerThread(CountDownLatch latch){
        this.latch=latch;
    }


    @Override
    public void run(){
        try{
            Random random = new Random();
            System.out.println(Thread.currentThread().getName()+"Has been started");
            int sleepTime = 1000 + random.nextInt(5000); // 1 to 5 seconds
            Thread.sleep(sleepTime);
            System.out.println(Thread.currentThread().getName()+"Has been completed in "+sleepTime);


            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
