package OOP;

public class Main {
    public static void main(String[] args) {

        // 🔹 Creating a Car object using constructor with parameters
        Car car = new Car("Evo", "Blue", "Mitsubishi", 120000);  //count 1
        Car car3 = new Car("Evo", "Red", "Mitsubishi", 120000); // count 2
        // 🔹 Accessing object properties using getter methods
        System.out.println(car.getCar());     // Get model name
        System.out.println(car.getColour());  // Get color
        System.out.println(car.getBrand());   // Get brand
        System.out.println(car.getPrice());   // Get price

        System.out.println(); // For spacing between outputs
        System.out.println();

        // 🔹 OR: Creating a Car object using default constructor and setters
        Car car2 = new Car(); // Using no-argument constructor //count 3
        car2.setBrand("Toyota");       // Set brand
        car2.setPrice(1500000);        // Set price
        car2.setCar("Supra");          // Set model
        car2.setColour("Black");       // Set color

        // 🔹 Print the car object using toString()
        System.out.println(car2.toString());

        // 🔹 Storing objects in an array
        Car[] cars = new Car[]{car, car2};

        System.out.println("Array as object");

        // 🔹 Loop through the array and print each Car object
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString()); // Calls toString() for each object
        }

        System.out.println(Car.numOfCar); //static variable is share across object
        //or use method
        Car.totalCar(); // everytime object is create it will add count to totalcar count.
    }
}
