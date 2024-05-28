import java.util.Scanner;

class DisCalculator {

    // Method to calculate the distance between two coordinates
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Main method to get user input and demonstrate the distance calculation
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first coordinate (x1, y1)
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();

        // Prompt the user for the second coordinate (x2, y2)
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();

        // Create a DistanceCalculator object
        DisCalculator distanceCalculator = new DisCalculator();

        // Calculate the distance between the two points
        double distance = distanceCalculator.calculateDistance(x1, y1, x2, y2);

        // Display the result
        System.out.println("The distance between the two points is: " + distance);

        // Close the scanner
        scanner.close();
    }
}

