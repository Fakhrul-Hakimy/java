package basic;

import java.util.Scanner;

public class ifelse { // this method will show how to use if for string,int and boolean
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name=scanner.nextLine();

        System.out.print("Are you student (true/false) :");
        boolean isStudent=scanner.nextBoolean();

        System.out.print("Enter your age: ");
        int age= scanner.nextInt();
        //will check to several group such as senior = 65 , adult = 18 baby =0 not exist yet <0

        // Will great use if name is enter
        if(name.isEmpty()){//this is string method isEmpty will check if name is blank or ""
            System.out.println("Welcome User !");
        }else{
            System.out.println("Welcome"+name);
        }

        //for age int type
        if(age>=65){
            System.out.println("You are a senior");
        }else if(age>=18){
            System.out.println("You are a adult");
        }else if(age==0){
            System.out.println("You are a baby");
        }else if(age<0){
            System.out.println("Why are you here");
        }else{
            System.out.println("You are a child");
        }

        //for boolean type

        if(isStudent){
            System.out.println("You are a student");
        }else{
            System.out.println("You are not student");
        }

        scanner.close(); // close scanner object
    }
}
