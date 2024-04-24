package com.jap.course3;

class CurrentAccount extends BankAccount {
    // Step 4: Inherit constructor
    public CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Step 6: Implementation of specialOperation for CurrentAccount
    @Override
    public void specialOperation() {
        System.out.println("Special operation for Current Account");
    }
}