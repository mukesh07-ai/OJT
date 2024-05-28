public class b {
    public static void main(String[] args) {
        int number = 25; // Example integer

        // Convert integer to binary
        String binaryString = Integer.toBinaryString(number);

        System.out.println("Integer: " + number);
        System.out.println("Binary: " + binaryString);



        String binaryInt = "11001"; // Example binary string

        // Convert binary to integer
        int number1 = Integer.parseInt(binaryInt, 2);

        System.out.println("Binary: " + binaryString);
        System.out.println("Integer: " + number1);
    }
}

    