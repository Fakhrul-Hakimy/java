package thread.tuto8Atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AirspaceControl extends Thread implements Controllable{
    private AtomicInteger activePlane = new AtomicInteger(0);
    private final int threshold=5;


    @Override
    public void planeTakesOff() {
        System.out.println("Plane took off. Current airspace count: "+activePlane.incrementAndGet());
        checkAirspaceCongestion(threshold);

    }

    @Override
    public void planeLands() {
        System.out.println("Plane landed. Current airspace count: "+activePlane.decrementAndGet());
    }

    @Override
    public int getCurrentAirspaceCount() {
        return activePlane.get();
    }

    @Override
    public boolean isAirspaceCongested(int threshold) {
        if(activePlane.get()>threshold){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void checkAirspaceCongestion(int threshold) {
        if(isAirspaceCongested(threshold)){
            triggerCongestionAlert();
        }

    }

    @Override
    public void triggerCongestionAlert() {
        System.out.println("Danger: Too many airplanes");
    }
}
