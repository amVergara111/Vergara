import java.util.Scanner; // Import Scanner class

public class MyFirstApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Correct Scanner instantiation
        System.out.println("Enter Name:");
        String name = input.nextLine();

        System.out.println("Hello " + name + " Welcome! The result of 8 + 8 is: " + (8 + 8));
        
        input.close(); // It's a good practice to close the Scanner object when done
    }
}