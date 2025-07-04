package thread.sync;

public class Sync extends Thread{

    static int counter=0;
    @Override
    public void run() {
        counter();

    }


     synchronized static void counter(){
        while(counter<10){
            System.out.println(Thread.currentThread().getName()+ " | Before : "+counter);
            counter++;
            System.out.println(Thread.currentThread().getName()+ " | After : "+counter);
        }

    }
}
