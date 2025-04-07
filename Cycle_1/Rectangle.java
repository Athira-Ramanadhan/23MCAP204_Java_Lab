import java.util.Scanner;

public class Rectangle {
    // Fields
    double length;
    double width;

    // Default constructor
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Parameterized constructor
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        // Create Rectangle object using user input
        Rectangle rect = new Rectangle(l, w);

        // Display results
        System.out.println("\nArea: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        sc.close();
    }
}
