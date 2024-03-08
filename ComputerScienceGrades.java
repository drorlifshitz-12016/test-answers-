import java.util.Random;

public class ComputerScienceGrades {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Constants
        int numberOfStudents = 25;
        int maxGrade = 100;
        int badGradeThreshold = 80;

        // Generate and print grades for 25 students
        for (int i = 1; i <= numberOfStudents; i++) {
            int serialCode = 1000 + i; // Assuming serial codes start from 1001
            int testGrade = random.nextInt(maxGrade + 1); // Generates a random grade between 0 and 100

            // Print serial code and grade
            System.out.println("Student " + serialCode + ": " + testGrade);

            // Check for bad result
            if (testGrade < badGradeThreshold) {
                System.out.println("Bad result");
            }
        }
    }
}
