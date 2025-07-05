package project;

public class test1 implements Runnable{

    int number;

    test1(int number){
        this.number=number;
    }
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i+"*"+number+" : "+(i*number));
        }
    }

    public static void main(String[] args) {

        for(int i=1;i<=3;i++){
            Thread thread= new Thread(new test1(i));
            thread.start();

        }

    }
}
