package thread.tuto4Runnable;

public class Even implements Runnable{
    int start;
    int end;

    Even(int start, int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        for(int i=start;i<=end;i++){
            if (i % 2 != 0) {
                System.out.println("Odd method : "+i);
            }
        }
    }
}
