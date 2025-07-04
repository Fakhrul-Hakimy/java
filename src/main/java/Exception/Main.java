package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 📌 Exception Handling in Java
 * -----------------------------
 * Exceptions are events that disrupt the normal flow of the program (e.g., divide by zero, invalid input).
 * Java provides try-catch-finally blocks to handle exceptions gracefully.
 *
 * Key Concepts Demonstrated:
 * - try block: code that may throw an exception
 * - catch blocks: handle specific exception types (Arithmetic, InputMismatch, etc.)
 * - finally block: always runs (used to release resources like closing Scanner)
 *
 * This example shows how to handle user input safely using Scanner and multiple catch blocks.
 */

public class Main {

    public static void main(String[] args) {

        // Example: System.out.println(1/0); → would crash the program without try-catch

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt(); // May throw InputMismatchException
            System.out.println("You entered: " + num);

        } catch (ArithmeticException e) {
            // Handles arithmetic-related errors (not triggered in this case)
            System.out.println("Can't divide by 0");

        } catch (InputMismatchException e) {
            // Handles wrong input type (e.g., typing a string instead of an int)
            System.out.println("Please enter a valid number");

        } catch (Exception e) {
            // Handles any other general exceptions
            System.out.println("Something went wrong.");

        } finally {
            // Always runs — good place to close resources
            scanner.close();
            System.out.println("Finally is being run");
        }
    }
}
