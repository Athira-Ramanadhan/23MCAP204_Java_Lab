import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter role (Manager/Developer/Intern): ");
        String role = sc.nextLine().toLowerCase();

        // Input Employee Experience
        System.out.print("Enter years of experience: ");
        int exp= sc.nextInt();
        sc.close();

        
        int salary = 0;
        if (role.equals("manager")) {
            salary = 50000;
        } else if (role.equals("developer")) {
            salary = 30000;
        } else if (role.equals("intern")) {
            salary = 15000;
        } else {
            System.out.println("Invalid role entered.");
            return;
        }

        // Apply Experience-Based Bonus
        double bonus = 0;
        if (exp >= 3 && exp <= 5) {
            bonus = 0.10 * salary;
        } else if (exp > 5) {
            bonus = 0.20 * salary;
        }

        double totalSalary = salary + bonus;
        System.out.println("Base Salary: $" + salary);
        System.out.println("Bonus: $" + (int) bonus);
        System.out.println("Total Salary: $" + (int) totalSalary);
    }
}
