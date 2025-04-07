import java.util.Scanner;

// Interface Shape
interface Shape {
    double calculateArea();  // abstract method
}

// Triangle class
class Triangle implements Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override calculateArea()
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override calculateArea()
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class
public class Shapedemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Triangle
        System.out.println("Enter base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);

        // Input for Rectangle
        System.out.println("Enter length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);

        // Output
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        scanner.close();
    }
}

