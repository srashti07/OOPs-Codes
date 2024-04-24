package com.jap.course3;

public class BankAccountImpl {
    public static void main(String[] args) {
        // Step 7: Declare and initialize objects of the SavingsAccount and CurrentAccount classes
        SavingsAccount savingsAccount = new SavingsAccount("SA123", "John Doe", 5000.0);
        CurrentAccount currentAccount = new CurrentAccount("CA456", "Jane Doe", 10000.0);

        // Step 7: Call methods to retrieve balance, debit, and credit amount
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        savingsAccount.credit(2000.0);
        savingsAccount.debit(1000.0);
        savingsAccount.specialOperation(); // Call the specialOperation method

        System.out.println("\nCurrent Account Balance: $" + currentAccount.getBalance());
        currentAccount.debit(500.0);
        currentAccount.credit(1500.0);
        currentAccount.specialOperation(); // Call the specialOperation method
    }
}
