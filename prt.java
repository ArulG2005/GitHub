import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("Simple Interest: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
