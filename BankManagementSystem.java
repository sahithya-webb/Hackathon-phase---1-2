import java.util.Scanner;

class BankAccount {
    // Data members
    String accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money if sufficient balance is available
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to check and return the current balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details and balance
    public void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankManagementSystem {
    
    // Separate method to handle deposit operation
    public static void performDeposit(BankAccount account, Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    // Separate method to handle withdrawal operation
    public static void performWithdrawal(BankAccount account, Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading account details from user input
        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating BankAccount object using parameterized constructor
        BankAccount myAccount = new BankAccount(accNumber, accName, initialBalance);

        // Display initial account info
        myAccount.displayAccount();

        // Perform deposit using a separate method
        performDeposit(myAccount, scanner);

        // Perform withdrawal using a separate method
        performWithdrawal(myAccount, scanner);

        // Display final account details
        System.out.println("\n--- Final Account Status ---");
        myAccount.displayAccount();

        scanner.close();
    }
}