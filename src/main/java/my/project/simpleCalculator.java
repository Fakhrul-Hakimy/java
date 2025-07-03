package project;
import java.util.Scanner; // Import Scanner class for user input

public class simpleCalculator {

    // Method to add two numbers
    static int add(int a, int b){
        return (a + b);
    }

    // Method to subtract two numbers
    static int subtract(int a, int b){
        return (a - b);
    }

    // Method to multiply two numbers
    static int multiply(int a, int b){
        return (a * b);
    }

    // Method to divide two numbers (note: returns double, but needs casting for correct result)
    static double divide(int a, int b){
        return ((double) a / b); // Cast to double to avoid integer division
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        int option = 0; // Variable to store user menu choice

        // Loop until user chooses to exit (option 5)
        do {
            // Display calculator menu
            System.out.print("=== Simple Calculator ===\n" +
                    "1. Add\n" +
                    "2. Subtract\n" +
                    "3. Multiply\n" +
                    "4. Divide\n" +
                    "5. Exit\n" +
                    "Choose an option: ");

            option = scanner.nextInt(); // Get user option
            int num1, num2; // Variables to store input numbers

            // Use switch-case to handle user option
            switch (option){

                case 1: // Addition
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + add(num1, num2)); // Call add method
                    break;

                case 2: // Subtraction
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + subtract(num1, num2)); // Call subtract method
                    break;

                case 3: // Multiplication
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + multiply(num1, num2)); // Call multiply method
                    break;

                case 4: // Division
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextInt();

                    // Prevent division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2)); // Call divide method
                    }
                    break;

                case 5: // Exit program
                    System.out.println("Exiting system...");
                    break;

                default: // Handle invalid menu options
                    System.out.println("Invalid option. Please choose between 1 and 5.");
                    break;
            }

            // Ask if the user wants to continue unless they chose to exit
            if (option != 5) {
                scanner.nextLine(); // Consume leftover newline
                System.out.print("Do you want to continue (y/n): ");
                String ans = scanner.nextLine();

                // If user says "n", change option to 5 to exit
                if (ans.equalsIgnoreCase("n")) {
                    option = 5;
                }
            }

        } while (option != 5); // Loop ends when user chooses to exit
    }
}
