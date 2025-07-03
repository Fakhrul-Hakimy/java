package OOP;

public class Car {

    private String car;
    private String colour;
    private String brand;
    private double price;
    static int numOfCar;

    public Car(String car, String colour, String brand,double price) {
        this.car = car;
        this.colour= colour;
        this.brand=brand;
        this.price=price;
        numOfCar++;
    }

    static void totalCar(){
        System.out.println("Total car : "+numOfCar);
    }

    public Car() {
        numOfCar++;
    }

    public String getCar() {
        return car;
    }
    public String getColour() {
        return colour;
    }
    public String getBrand() {
        return brand;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car details : \n" +
                "car = " + car + "\n" +
                "colour = " + colour +"\n"+
                "brand = " + brand  +"\n"+
                "price = " + price +"\n";
    }
}
