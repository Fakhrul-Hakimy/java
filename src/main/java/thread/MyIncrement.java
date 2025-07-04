package thread;

public class MyIncrement extends Thread{

    public int time;
    int number =0;

    MyIncrement(int time){
        this.time=time;
    }

    @Override
    public void run() {
        for(int i=0;i<time;i++){
            number++;
        }
    }
}
