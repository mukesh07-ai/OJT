import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        // Input annual interest rate
        System.out.print("Enter the annual interest rate (R) in percentage: ");
        double rate = scanner.nextDouble();

        // Input time in years
        System.out.print("Enter the time (T) in years: ");
        int time = scanner.nextInt();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output the result
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
