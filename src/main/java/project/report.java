package project;

import java.util.concurrent.CountDownLatch;

public class report implements Runnable{

    CountDownLatch latch = new CountDownLatch(3);
    String name;
     static int data=0;
    report(CountDownLatch latch,String name){
        this.latch=latch;
        this.name=name;
    }

    synchronized  void reportData(int i){
        data++;
    }

    @Override
    public void run() throws RuntimeException {
        try{
            System.out.println("Processing "+name+" Data.");
            Thread.sleep(100);
            latch.countDown();
            reportData(1);
            System.out.println(name+" Data proceed and added to the report.");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CountDownLatch latch1= new CountDownLatch(3);
        report thread1= new report(latch1 , "Sales");
        report thread2= new report(latch1 , "Marketing");
        report thread3= new report(latch1 , "Finance");
        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
        try{
            latch1.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Generating report will full data." +data);
    }


}
