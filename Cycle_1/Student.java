import java.util.Scanner;

public class Student {
    // Fields
    int studentId;
    String name;
    double marks;

    // Constructor to initialize all fields
    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("Marks     : " + marks);
    }

    // Method to check pass/fail
    boolean isPassed() {
        return marks >= 40;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // Clear newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Create Student object
        Student s = new Student(id, name, marks);

        // Display details
        s.displayDetails();

        // Check and print pass/fail
        if (s.isPassed()) {
            System.out.println("Result    : Passed");
        } else {
            System.out.println("Result    : Failed");
        }

        sc.close();
    }
}
