package project;

import java.util.concurrent.locks.ReentrantLock;

public class banking extends Thread {

    private static ReentrantLock lock = new ReentrantLock(true);
    private final static Object AliAccount = new Object();
    private final static Object BadrulAccount = new Object();
    boolean aliTransfer = false;

    banking(boolean aliTransfer) {
        this.aliTransfer = aliTransfer;

    }

    @Override
    public void run() {
        if (aliTransfer) {
            synchronized (AliAccount) {
                System.out.println("Locked AliAccount by " + Thread.currentThread().getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (BadrulAccount) {
                    System.out.println("Locked BadrulAccount by " + Thread.currentThread().getName());
                    System.out.println("Ali transferred to Badrul");
                }
            }
        } else {
            synchronized (BadrulAccount) {
                System.out.println("Locked BadrulAccount by " + Thread.currentThread().getName());
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (AliAccount) {
                    System.out.println("Locked AliAccount by " + Thread.currentThread().getName());
                    System.out.println("Badrul transferred to Ali");
                }
            }
        }
    }


        public static void main (String[]args){
            banking thread1= new banking(true);
            banking thread2= new banking(false);
            banking thread3= new banking(false);
            thread1.start();
            thread2.start();
            thread3.start();


        }
    }

