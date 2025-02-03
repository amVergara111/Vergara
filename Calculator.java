import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform arithmetic operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        
        // Check for division by zero
        if (num2 != 0) {
            int division = num1 / num2;
            // Display the results
            System.out.println("\nAddition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
        } else {
            // If division by zero, print an error
            System.out.println("Division: Error (Cannot divide by zero)");
        }
        
        // Close the scanner
        scanner.close();
    }
}