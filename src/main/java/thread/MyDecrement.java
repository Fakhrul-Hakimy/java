package thread;

public class MyDecrement extends Thread{

    public int time;
    int number =0;

    MyDecrement(int time){
        this.time=time;
    }

    @Override
    public void run() {
        for(int i=0;i<time;i++){
            number--;
        }
    }
}
