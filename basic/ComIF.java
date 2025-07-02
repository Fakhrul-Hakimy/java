package basic;

import java.util.Scanner;

public class ComIF { //compound if inside if

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isStudent;
        boolean notSenior;
        boolean isMember;

        System.out.println("Please answer in (true/false) format...");
        System.out.print("Are you student? : ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you first year student? : ");
        notSenior = scanner.nextBoolean();

        System.out.print("Are you a member? : ");
        isMember = scanner.nextBoolean();

        if(isStudent){
            System.out.println("Welcome to the shop.");

            if(isMember) {
                System.out.println("You got Member discount.");
            }

            if(!notSenior) {
                System.out.println("You got Senior discount.");
            }

            if(!isMember && notSenior) {
                System.out.println("No discount.");
            }

        } else {
            System.out.println("Only student can buy from this shop.");
        }
    }
}
