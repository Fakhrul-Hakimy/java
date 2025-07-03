package OOP.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        Van van= new Van();
        Bike bike= new Bike();

        car.go();
        van.go();
        bike.go();
        // if we want to store this in array can we putt it in same array?
        //Bike[] bikes={car,van,bike}; // we cant cause car and van is another child so what??
        // use vehicle the parent of all
        Vehicle[] vehicles= {car, van, bike}; // all extend or chilld of vehicle..

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
}
