import java.util.Random;

public class DivisibilityChecker {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Constants
        int numberOfPairs = 20;
        int num = 3; // Change this value to the desired divisor

        // Generate and print 20 random two-digit numbers
        for (int i = 0; i < numberOfPairs; i++) {
            int firstDigit = random.nextInt(9) + 1; // Generates a random digit from 1 to 9
            int secondDigit = random.nextInt(10); // Generates a random digit from 0 to 9
            int number = firstDigit * 10 + secondDigit; // Combines digits to create a two-digit number

            // Print the generated number
            System.out.print(number + ": ");

            // Check for divisibility and print "good" if divisible
            if (number % num == 0) {
                System.out.println("good");
            } else {
                System.out.println();
            }
        }
    }
}
