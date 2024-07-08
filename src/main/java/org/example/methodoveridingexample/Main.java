package org.example.methodoveridingexample;

// Superclass
class BankAccount {
    double balance;

    public BankAccount(double balance) {

        this.balance = balance;
    }

    // Method to be overridden
    double calculateInterest() {

        return balance * 0.01; // Default interest rate
    }

    void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    // calculateInterest method
    @Override
    double calculateInterest() {
        return balance * 0.04; // Interest rate for savings account
    }
}

// Subclass
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    // calculateInterest method
    @Override
    double calculateInterest() {
        return balance * 0.02; // Interest rate for checking account
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount genericAccount = new BankAccount(1000.00);
        BankAccount savingsAccount = new SavingsAccount(1000.00);
        BankAccount checkingAccount = new CheckingAccount(1000.00);

        //  generic account
        genericAccount.displayBalance();
        System.out.println("Interest: $" + genericAccount.calculateInterest());

        //  savings account
        savingsAccount.displayBalance();
        System.out.println("Interest: $" + savingsAccount.calculateInterest());

        // checking account
        checkingAccount.displayBalance();
        System.out.println("Interest: $" + checkingAccount.calculateInterest());
    }
}
