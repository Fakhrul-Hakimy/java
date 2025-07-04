package thread;

public class myThread extends Thread{

    @Override
    public void run() {
        System.out.println("This is running in thread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());

        myThread thread = new myThread();
        thread.start();

    }
}
