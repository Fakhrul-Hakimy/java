package thread.tuto4Runnable;

public class Odd implements Runnable{
    int start;
    int end;

    Odd(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        for(int i=start;i<=end;i++){
            if (i % 2 == 0) {
                System.out.println("Even method : "+i);
            }
        }
    }
}
