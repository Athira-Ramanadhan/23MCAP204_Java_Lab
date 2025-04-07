import java.util.Scanner;

public class BankAccount {
    String accountNo;
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(String accNum, String accHolder, double bal) {
        accountNo = accNum;
        accountHolder = accHolder;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: $" + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    // Display method
    void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNo);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take basic input
        System.out.print("Enter account number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accHolder = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        // Create account
        BankAccount account = new BankAccount(accNum, accHolder, bal);

        // Perform deposit
        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        // Perform withdrawal
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        // Show final account info
        account.displayAccountInfo();

        sc.close();
    }
}

