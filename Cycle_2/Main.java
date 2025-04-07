// Abstract class

import JavaBasics.employee;

abstract class employee {
    String name;
    int id;

    // Constructor
    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract double calculateSalary();

    // Method to display basic info
    void displayInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}

// Full-time employee class
class FullTimeEmployee extends employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

   
    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee class
class PartTimeEmployee extends employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

// Main class
public  class Main {
    public static void main(String[] args) {
        // Full-time employee
        FullTimeEmployee ft = new FullTimeEmployee("Arpitha", 106, 50000);
        System.out.println("Full-Time Employee:");
        ft.displayInfo();
        System.out.println("Salary: $" + ft.calculateSalary());

        System.out.println();

        // Part-time employee
        PartTimeEmployee pt = new PartTimeEmployee("Kiara", 106, 200, 20);
        System.out.println("Part-Time Employee:");
        pt.displayInfo();
        System.out.println("Salary: $" + pt.calculateSalary());
    }
}
