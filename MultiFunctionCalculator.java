import java.util.Scanner;

public class MultiFunctionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu for the user
        System.out.println("Choose an operation:");
        System.out.println("1. Find the maximum number among three given numbers");
        System.out.println("2. Calculate the average of a set of numbers");
        System.out.println("3. Check if a given year is a leap year");
        System.out.println("4. Find the maximum of two given numbers");
        System.out.println("5. Determine whether a given number is positive, negative, or zero");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        // Execute the chosen operation
        switch (choice) {
            case 1:
                // Find the maximum number among three numbers
                System.out.print("Enter the first number: ");
                int A = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int B = scanner.nextInt();
                System.out.print("Enter the third number: ");
                int C = scanner.nextInt();

                int maxNum = (A > B && A > C) ? A : (B > C ? B : C);
                System.out.println("The maximum number is: " + maxNum);
                break;

            case 2:
                // Calculate the average of a set of numbers
                System.out.print("Enter the total number of values: ");
                int n = scanner.nextInt();
                int sum = 0;

                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter number " + i + ": ");
                    int num = scanner.nextInt();
                    sum += num;
                }

                double average = (double) sum / n;
                System.out.println("The average is: " + average);
                break;

            case 3:
                // Check if a given year is a leap year
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            System.out.println(year + " is a leap year.");
                        } else {
                            System.out.println(year + " is not a leap year.");
                        }
                    } else {
                        System.out.println(year + " is a leap year.");
                    }
                } else {
                    System.out.println(year + " is not a leap year.");
                }
                break;

            case 4:
                // Find the maximum of two given numbers
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();

                int maxOfTwo = (num1 > num2) ? num1 : num2;
                System.out.println("The maximum number is: " + maxOfTwo);
                break;

            case 5:
                // Determine whether a given number is positive, negative, or zero
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();

                if (num > 0) {
                    System.out.println("The number is Positive.");
                } else if (num < 0) {
                    System.out.println("The number is Negative.");
                } else {
                    System.out.println("The number is Zero.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
                break;
        }

        scanner.close();
    }
}

