package thread;

public class myRunnable implements Runnable{


    @Override
    public void run() {
        System.out.println("This is running in runnable thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

    }

    public static void main(String[] args) throws InterruptedException{
        Thread myThread= new Thread(new myRunnable(),"runnableThread");
        myThread.start();

    }



}
