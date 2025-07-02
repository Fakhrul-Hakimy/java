package basic;

import java.util.Scanner;

public class Switch {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number of day is in week : ");
        int day=scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Today is Monday");
                break; //break is needed to end the case statement which is case 1
            case 2:
                System.out.println("Today is Tuesday");
                break;
            default:// default is similiar to else in if else any other number other than 1 or 2 will run default statement
                System.out.println("Today is not monday or tuesday");
                break;


        }


    }
}
