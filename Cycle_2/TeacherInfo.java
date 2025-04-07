import java.util.Scanner;

// Person class
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class extending Person
class Employee extends Person {
    String empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor
    public Employee(String name, String gender, String address, int age,
                    String empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class extending Employee
class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;

    // Constructor
    public Teacher(String name, String gender, String address, int age,
                   String empId, String companyName, String qualification, double salary,
                   String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display teacher info
    public void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Gender     : " + gender);
        System.out.println("Address    : " + address);
        System.out.println("Age        : " + age);
        System.out.println("Emp ID     : " + empId);
        System.out.println("Company    : " + companyName);
        System.out.println("Qualification : " + qualification);
        System.out.println("Salary     : " + salary);
        System.out.println("Subject    : " + subject);
        System.out.println("Department : " + department);
        System.out.println("Teacher ID : " + teacherId);
    }
}

// Main class
public class TeacherInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            String empId = sc.nextLine();

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            String teacherId = sc.nextLine();

            // Create Teacher object
            teachers[i] = new Teacher(name, gender, address, age, empId, companyName,
                    qualification, salary, subject, department, teacherId);
        }

        // Display all teacher details
        System.out.println("\n========== All Teacher Details ==========");
        for (Teacher t : teachers) {
            t.display();
        }

        sc.close();
    }
}
