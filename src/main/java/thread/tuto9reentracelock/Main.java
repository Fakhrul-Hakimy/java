package thread.tuto9reentracelock;

public class Main {
    public static void main(String[] args) {
        Booking thread2= new Booking(25,"Counter 2");
        Booking thread3= new Booking(25,"Counter 3");
        Booking thread1= new Booking(25,"Counter 1");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
