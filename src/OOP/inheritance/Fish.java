package OOP.inheritance;

public class Fish extends Animal{

    @Override //methhod override from animal move method make swim for fish method
    void move(){
        System.out.println("Swimming");
    }
}
