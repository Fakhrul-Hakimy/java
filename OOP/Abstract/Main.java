package OOP.Abstract;

public class Main {
    public static void main(String[] args) {

        //Shape shape= new Shape(); cannnot create cause it abstract
        Circle circle= new Circle(3);
        Triangle triangle = new Triangle(4,5);

        circle.display();
        triangle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());

    }
}
