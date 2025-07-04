package thread.tuto9reentracelock;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class Booking extends Thread{

    private static final Set<Integer> bookedSeats = new HashSet<>();
    private static final ReentrantLock lock = new ReentrantLock(true);
    int seat;
    String CounterName;

    Booking(int seat, String CounterName){
        this.seat=seat;
        this.CounterName=CounterName;

    }

    @Override
    public void run() {
        lock.lock();
        try{
            if(!(bookedSeats.contains(seat))){
                bookedSeats.add(seat);
                System.out.println(CounterName+" : Seat "+seat+" has been Booked.");
            }else{
                System.out.println(CounterName+" : Seat "+seat+" cannot been Booked.");
            }
        }finally {
            lock.unlock();
        }


    }
}
