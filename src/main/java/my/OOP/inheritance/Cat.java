package OOP.inheritance;

public class Cat extends Animal{

    int lives=9;

    Cat(){

    }

    Cat(String name){
        super(name);
    }

    void speak(){
        System.out.println("Meoow");
    }
}
