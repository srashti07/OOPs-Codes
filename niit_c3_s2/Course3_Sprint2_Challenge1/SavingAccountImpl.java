import java.lang.System;

public class SavingAccountImpl {
    public static void main(String[] args) {
        // Created a savings account object with a unique account number
        SavingAccount sa = new SavingAccount(12345678987L, "Nikhil", 2000.0);

        // Check account balance
        double balance = sa.AccountBalance();
        System.out.println("Account balance: " + balance);

        // Debit cash
        sa.debitCash(600.0);

        // Credit cash
        sa.creditCash(300.0);

        // Check account balance again
        balance = sa.AccountBalance();
        System.out.println("Updated account balance: " + balance);

        // Check account status
        boolean isActive = sa.isAccountActive();
        System.out.println("Account status: " + (isActive ? "Active" : "Inactive"));
    }
}