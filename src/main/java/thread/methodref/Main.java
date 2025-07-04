package thread.methodref;

public class Main extends Thread{

    public static void Display(){
        System.out.println("Displaying.....");
    }

    public static void counting(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Thread t1= new Thread(()-> Display());// this is using lambda
        t1.start();

        // this is using method reference
        Thread t2= new Thread(Main:: Display);// this is using method reference in format class::method name
        t2.start();
        Thread t3= new Thread(Main:: counting);// this is using method reference in format class::method name
        t3.start();

    }
}
