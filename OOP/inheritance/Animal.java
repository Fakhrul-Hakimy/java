package OOP.inheritance;

public class Animal {

    boolean isAlive;
    String name;

    Animal(){
        isAlive= true;
    }
    Animal(String name){
        this.name=name;
        isAlive= true;
    }

    void eat(){
        System.out.println("Animal is eating");
    }

    void move(){
        System.out.println("Running");
    }
}
