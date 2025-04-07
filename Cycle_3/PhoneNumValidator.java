import java.util.Scanner;

// Custom Exception
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class PhoneNumValidator {

    // Method to validate phone number
    public static void validatePhoneNumber(String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must contain exactly 10 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        try {
            validatePhoneNumber(phone);
            System.out.println("Phone number is valid.");
        } catch (InvalidPhoneNumberException e) {
            System.out.println("Invalid phone number: " + e.getMessage());
        }

        scanner.close();
    }
}
