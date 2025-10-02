import java.util.Scanner;

public class CollatzConjecture {

    // Method to calculate and print Collatz sequence
    public static void collatzSequence(int n) {
        System.out.println("Collatz Sequence for " + n + ":");
        
        // Continue the sequence until n becomes 1
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2; // n is even
            } else {
                n = 3 * n + 1; // n is odd
            }
        }
        System.out.println(1); // the sequence always ends at 1
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a positive integer to begin the Collatz sequence: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calling the Collatz sequence method
            collatzSequence(number);
        }

        scanner.close();
    }
}
