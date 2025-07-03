package OOP.inheritance;

public class Main {

    public static void main(String[] args) {

        Dog dog=new Dog(); //child of animal class
        dog.eat(); // inheritance from animal class
        dog.name="Alex";
        System.out.println(dog.isAlive + " With " +dog.lives+"Lives"); //
        System.out.println("Name of the dog : "+dog.name);
        // inheritance from animal class
        dog.speak();

        Cat cat= new Cat(); //child of animal class
        cat.name="Jane";
        cat.eat(); // inheritance from animal class
        System.out.println(cat.isAlive + " With " +cat.lives+"Lives"); // inheritance from animal class
        System.out.println("Name of the cat : "+cat.name);
        cat.speak();
        System.out.print("Cat is : "); cat.move();


        Fish fish=new Fish();
        System.out.print("Fish is : ");
        fish.move();
    }
}
