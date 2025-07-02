package basic;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name : ");
        String name = scanner.nextLine();
        System.out.print("Please enter the age : ");
        int age = scanner.nextInt();


        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

        System.out.print("are youu a student? (true or false) : ");
        boolean answer = scanner.nextBoolean();
        if (answer) {
            System.out.println("Your are a student");
        }else{
            System.out.println("Your are not student");
        }
    }
}
