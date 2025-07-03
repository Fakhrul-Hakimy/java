package basic;

import java.util.Scanner;
public class doWhile {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        boolean loop=true;
        do{
            System.out.println("Welcome to the System");
            System.out.print("Enter false to stop (false/true): ");
            loop=scanner.nextBoolean();

        }while(loop);

        System.out.println("Exit from the System");
    }
}
