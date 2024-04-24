package com.jap.course3;

public class SavingsAccountImpl {
    public static void main(String[]args){

        SavingsAccount sa = new SavingsAccount();

        //Initializing the account details using setter methods
        sa.setAccountHolderName("Nikhil");
        sa.setAccountNumber(1234567765L);
        sa.setOpeningDate("05-10-2020");
        sa.setAccountStatus("Active");
        sa.setAvailableBalance(1500.0);
        sa.setTotalBalance(2000.0);
        sa.setInternetBankingEnabled(true);
        sa.setMobileBankingEnabled(true);
        sa.setInterestRate(0.02);
        sa.setModeOfOperation("Self-operated");

        // Debit cash
        sa.debitCash(500.0);

        // Credit cash
        sa.creditCash(300.0);

        // Check account balance again
        double balance = sa.getAvailableBalance();
        System.out.println("Updated account balance: " + balance);



        //Displaying the account details
        System.out.println("Account Holder Name: "+sa.getAccountHolderName());
        System.out.println("Account Number: "+sa.getAccountNumber());
        System.out.println("Account Opening Date: "+sa.getOpeningDate());
        System.out.println("Available Balance: "+sa.getAvailableBalance());
        System.out.println("Total Balance: "+sa.getTotalBalance());
        System.out.println("Internet Banking Enabled: "+sa.isInternetBankingEnabled());
        System.out.println("Mobile Banking Enabled: "+sa.isMobileBankingEnabled());
        System.out.println("Interest Rate: "+sa.getInterestRate());
        System.out.println("Mode of Operation: "+sa.getModeOfOperation());
    }
}