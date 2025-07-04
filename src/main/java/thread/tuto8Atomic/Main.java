package thread.tuto8Atomic;

public class Main {
    public static void main(String[] args) {
        AirspaceControl controller = new AirspaceControl();

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {controller.planeTakesOff();}).start();
        }

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                controller.planeLands();
            }).start();
        }
    }
}
