package thread.tuto10Callable;

import java.util.concurrent.*;

public class Main implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("Running in callable");
        return 850;
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException{
        ExecutorService service= Executors.newSingleThreadExecutor();
        Main  helloFuture= new Main();
        Future <Integer> value= service.submit(helloFuture);
        System.out.println(value.get());





    }


}
