import java.util.Scanner;

class rectangle {
    // Attributes
    private double length;
    private double breadth;

    // Constructor
    public rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // Method to display the area of the rectangle
    public void displayArea() {
        System.out.println("The area of the rectangle is: " + calculateArea());
    }

    // Main method to get user input and create a Rectangle object
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt the user for the breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Create a Rectangle object
        rectangle rectangle = new rectangle(length, breadth);

        // Display the area of the rectangle
        rectangle.displayArea();

        // Close the scanner
        scanner.close();
    }
}
