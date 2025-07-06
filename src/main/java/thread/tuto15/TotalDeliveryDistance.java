package thread.tuto15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TotalDeliveryDistance {

    public static void main(String[] args) {
        // Simulate a massive delivery record list (e.g., 10 million distances)
        List<Double> deliveryDistances = generateRandomDistances(10_000_000);

        // Calculate total distance using parallel stream
        double totalDistance = deliveryDistances
                .parallelStream() // Utilize multi-core processors
                .mapToDouble(Double::doubleValue)
                .sum();

        // Output the result
        System.out.printf("Total delivery distance: %.2f km%n", totalDistance);
    }

    // Helper method to generate dummy data
    private static List<Double> generateRandomDistances(int count) {
        List<Double> distances = new ArrayList<>(count);
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < count; i++) {
            // Generate distances between 0.5 km and 25 km
            distances.add(random.nextDouble(0.5, 25.0));
        }
        return distances;
    }
}