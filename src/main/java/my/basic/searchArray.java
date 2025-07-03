package basic;

public class searchArray {
    public static void main(String[] args) {

        // Declare and initialize an integer array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7; // The number we want to search for

        // Loop through each number in the array
        for (int i = 0; i < numbers.length; i++) {
            // Check if the current number matches the target
            if (target == numbers[i]) {
                System.out.println("Target found"); // Print if target is found
            } else {
                System.out.println(numbers[i]); // Print the current number if not target
            }
        }

        // Declare and initialize a string array of fruits
        String[] fruits = {"banana", "apple", "pineapple"};
        String Tfruit = "apple"; // The fruit we want to check

        // Enhanced for loop to go through each fruit in the array
        for (String fruit : fruits) {
            // Check if the current fruit matches the target fruit
            if (Tfruit.equals(fruit)) {
                System.out.println(fruit + " has been buy "); // Print if fruit is found
            } else {
                System.out.println(fruit + " for sale "); // Print if fruit is not the one bought
            }
        }
    }
}
