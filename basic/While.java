package basic;
import java.util.Scanner;
public class While {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean isRun=true;
        while(isRun){

            System.out.println("Welcome to the System");
            System.out.print("Enter false to stop (false/true): ");
            isRun=scanner.nextBoolean();

        }
        System.out.println("Exit from the System");

    }
}
