import java.util.Scanner;

class Circle {
    // Attribute
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display the area of the circle
    public void displayArea() {
        System.out.println("The area of the circle is: " + calculateArea());
    }

    // Main method to get user input and create a Circle object
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object
        Circle circle = new Circle(radius);

        // Display the area of the circle
        circle.displayArea();

        // Close the scanner
        scanner.close();
    }
}

