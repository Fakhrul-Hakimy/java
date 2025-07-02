package OOP;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("EVO","Blue","Mitsubishi",120000);
        System.out.println(car.getCar());
        System.out.println(car.getColour());
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());

        System.out.println();
        System.out.println();
        //or
        Car car2= new Car();
        car2.setBrand("Toyota");
        car2.setPrice(1500000);
        car2.setCar("Supra");
        car2.setColour("Black");
        System.out.println(car2.toString());

    }
}
