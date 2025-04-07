import java.util.Scanner;

// Custom Exception
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {
    
    // Method to validate password
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {  // checks for at least one digit
            throw new InvalidPasswordException("Password must contain at least one number.");
        }

        if (!password.matches(".*[\\$#&)].*")) {  // checks for special characters $, #, &, )
            throw new InvalidPasswordException("Password must contain at least one special character: $, #, &, )");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }

        scanner.close();
    }
}
