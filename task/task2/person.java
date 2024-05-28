import java.util.Scanner;

class person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to greet the user
    public void greet() {
        System.out.println("Hey..., " + name + "! You are " + age + " years old.");
    }

    // Main method to get user input and create a Person object
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Create a Person object
        person person = new person(name, age);

        // Greet the user
        person.greet();

        // Close the scanner
        scanner.close();
    }
}
