package OOP.inheritance;

public class Dog extends Animal{
    int lives=1;
    Dog(){
    }

    Dog(String name){
        super(name);
    }
    void speak(){
        System.out.println("Woof");
    }
}
