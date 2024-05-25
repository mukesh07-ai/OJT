import java.util.Scanner;

public class c {
    public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter a number: ");
    //     int number = scanner.nextInt();

    //     long factorial = 1;

    //     for(int i = 1; i <= number; i++) {
    //         factorial *= i;
    //     }

    //     System.out.println("Factorial of " + number + " is: " + factorial);
    //     scanner.close();


    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long factorial = factorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
