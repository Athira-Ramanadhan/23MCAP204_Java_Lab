import java.util.Scanner;

// Custom Exception
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class Gradechecker {

    // Method to validate grade
    public static void validateGrade(char grade) throws InvalidGradeException {
        grade = Character.toUpperCase(grade); // Normalize to uppercase

        if (grade < 'A' || grade > 'F' || grade == 'E') {
            throw new InvalidGradeException("Grade must be between A and F (excluding E).");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student grade (A-F): ");
        char grade = scanner.next().charAt(0);

        try {
            validateGrade(grade);
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        }

        scanner.close();
    }
}

