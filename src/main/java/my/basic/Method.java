package basic;

import java.util.Scanner;

public class Method {

    // Method without parameters and without return value
    // Just prints a message
    static void message() {
        System.out.println("This is running from method message.");
    }

    // Method with one parameter and returns the number plus 2
    static int plus2(int number) {
        return (number + 2);
    }

    // Method overloading example:
    // This version takes two parameters and returns their sum plus 2
    static int plus2(int number1, int number2) {
        return (number1 + number2 + 2);
    }

    // Method to check if a number is positive (including zero)
    static boolean isPositive(int num) {
        if (num == 0) {
            return true;
        } else if (num > 0) {
            return true;
        }
        return false; // If number is less than 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner to get input from user

        message(); // Call method without parameters

        // --- Single Input ---
        System.out.print("Enter number to plus by 2 : ");
        int num = scanner.nextInt(); // Read input number

        // Call method plus2 with 1 argument (return type is int)
        System.out.println(plus2(num)); // Direct print without storing result

        int result = plus2(num); // Store the result in a variable
        System.out.println("Number for variable: " + result); // Print stored result

        // Check if the result is positive
        if (isPositive(result)) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }

        // --- Double Input (Method Overloading) ---
        System.out.println("Enter 2 numbers to plus by 2 : ");
        int num1 = scanner.nextInt(); // Read first number
        int num2 = scanner.nextInt(); // Read second number

        // Call overloaded method plus2 with 2 arguments
        System.out.println(plus2(num1, num2)); // Direct call without storing result

        int result1 = plus2(num1, num2); // Store result
        System.out.println("Number for variable: " + result1); // Print stored result

        // Check if the result is positive
        if (isPositive(result1)) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
    }
}
