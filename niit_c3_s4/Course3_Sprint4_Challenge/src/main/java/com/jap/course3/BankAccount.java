package com.jap.course3;

abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    // Step 3: Parameterized constructor for BankAccount class
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Step 5: Logic to retrieve account balance
    public double getBalance() {
        return balance;
    }

    // Step 5: Logic to debit cash
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Debit successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Invalid debit amount or insufficient funds.");
        }
    }

    // Step 5: Logic to credit cash
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid credit amount.");
        }
    }

    // Abstract method to be implemented by child classes
    public abstract void specialOperation();
}

