package com.jap.course3;

class SavingsAccount extends BankAccount {
    // Step 4: Inherit constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Step 6: Implementation of specialOperation for SavingsAccount
    @Override
    public void specialOperation() {
        System.out.println("Special operation for Savings Account");
    }
}
