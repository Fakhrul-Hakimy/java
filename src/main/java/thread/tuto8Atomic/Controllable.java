package thread.tuto8Atomic;

public interface Controllable {
    void planeTakesOff();
    void planeLands();
    int getCurrentAirspaceCount();
    boolean isAirspaceCongested(int threshold);
    void checkAirspaceCongestion(int threshold);
    void triggerCongestionAlert();
}
