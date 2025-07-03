package OOP.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create objects from different subclasses
        Car car = new Car();
        Van van = new Van();
        Bike bike = new Bike();

        // Call their respective go() methods
        car.go();
        van.go();
        bike.go();

        // ❌ If we try to store them in a Bike[] array, it won't work:
        // Bike[] bikes = {car, van, bike}; // ❌ car and van are not of type Bike

        // ✅ Instead, use an array of the parent class: Vehicle
        Vehicle[] vehicles = {car, van, bike}; // ✅ All three are subclasses of Vehicle

        System.out.println("Printing from array:");
        for (Vehicle vehicle : vehicles) {
            // This demonstrates polymorphism: the correct go() method is called
            // based on the actual object (Car, Van, or Bike), not just the type Vehicle.
            vehicle.go();
        }

        // We can also use a Vehicle reference and assign it different child class objects.
        Vehicle vehicle; // Right now, it's just a reference (not pointing to anything)

        // We can assign this based on user input:
        Scanner scanner = new Scanner(System.in);
        System.out.println("What vehicle do you want?");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Van");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // This demonstrates runtime polymorphism — which class to instantiate is decided at runtime.
        switch (choice) {
            case 1:
                vehicle = new Bike(); // vehicle reference points to a Bike object
                vehicle.go();         // Calls Bike's go() method
                break;
            case 2:
                vehicle = new Car();  // vehicle reference points to a Car object
                vehicle.go();         // Calls Car's go() method
                break;
            case 3:
                vehicle = new Van();  // vehicle reference points to a Van object
                vehicle.go();         // Calls Van's go() method
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close(); // Always close scanner to avoid resource leaks
    }
}
