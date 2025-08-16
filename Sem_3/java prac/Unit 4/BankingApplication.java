// Define a custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" + amount);
            System.out.println("Current balance: ₹" + balance);
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        // Initialize account with ₹1000.00
        BankAccount account = new BankAccount(1000.00);
        
        try {
            // Perform withdrawals
            account.withdraw(400.00);  // Success
            account.withdraw(300.00);  // Success
            account.withdraw(500.00);  // Throws InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
                