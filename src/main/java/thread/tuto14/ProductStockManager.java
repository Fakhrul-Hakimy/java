package thread.tuto14;

import java.util.concurrent.ConcurrentHashMap;

public class ProductStockManager {

    public static void main(String[] args) throws InterruptedException {
        // ConcurrentHashMap to store product stock levels
        ConcurrentHashMap<String, Integer> stockMap = new ConcurrentHashMap<>();

        // Initialize the stock of "ProductA" to 0
        stockMap.put("Monitor", 0);

        // Lambda expression to create a Runnable that adds 5 units 1000 times
        Runnable stockAdder = () -> {
            for (int i = 0; i < 1000; i++) {
                stockMap.compute("Monitor", (key, value) -> value + 5);
            }
        };

        // Create two threads with the same Runnable
        Thread thread1 = new Thread(stockAdder);
        Thread thread2 = new Thread(stockAdder);

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Print the final stock using a method reference
        stockMap.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}