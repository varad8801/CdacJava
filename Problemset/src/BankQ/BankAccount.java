package BankQ;

public class BankAccount {
    String accountNumber;
   String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA1234", "John Doe", 1000, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA5678", "Jane Doe", 1500, 500);

        // Perform transactions
        savingsAccount.deposit(200);
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountType();

        checkingAccount.withdraw(700);
        checkingAccount.displayAccountType();

        boolean overdraft = checkingAccount.checkOverdraft(1000);
        System.out.println("Overdraft Occurred: " + overdraft);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean checkOverdraft(double amount) {
        return (balance + overdraftLimit) >= amount;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}


