import java.util.Scanner;

public class MultiFunctionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Find Maximum of Three Numbers");
            System.out.println("2. Calculate Average of a Set of Numbers");
            System.out.println("3. Check if a Year is a Leap Year");
            System.out.println("4. Find Maximum of Two Numbers");
            System.out.println("5. Check if a Number is Positive, Negative, or Zero");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findMaxOfThree(scanner);
                    break;
                case 2:
                    calculateAverage(scanner);
                    break;
                case 3:
                    checkLeapYear(scanner);
                    break;
                case 4:
                    findMaxOfTwo(scanner);
                    break;
                case 5:
                    checkNumberType(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // A. Find the Maximum Among Three Numbers
    public static void findMaxOfThree(Scanner scanner) {
        System.out.print("Enter three numbers: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int MaxNum;
        if (A > B && A > C) {
            MaxNum = A;
        } else if (B > A && B > C) {
            MaxNum = B;
        } else {
            MaxNum = C;
        }

        System.out.println("Maximum number: " + MaxNum);
    }

    // B. Calculate the Average of a Set of Numbers
    public static void calculateAverage(Scanner scanner) {
        System.out.print("Enter the total number of values: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            sum += scanner.nextDouble();
        }

        double average = sum / n;
        System.out.println("Average: " + average);
    }

    // C. Determine Whether a Year is a Leap Year
    public static void checkLeapYear(Scanner scanner) {
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }

    // D. Find the Maximum of Two Given Numbers
    public static void findMaxOfTwo(Scanner scanner) {
        System.out.print("Enter two numbers: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int MaxNum = (A > B) ? A : B;
        System.out.println("Maximum number: " + MaxNum);
    }

    // E. Determine if a Number is Positive, Negative, or Zero
    public static void checkNumberType(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
