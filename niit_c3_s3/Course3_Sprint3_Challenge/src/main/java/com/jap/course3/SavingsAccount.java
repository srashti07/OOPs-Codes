package com.jap.course3;

public class SavingsAccount {
    private int age;
    private String accountHolderName;
    private long accountNumber;
    private String openingDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean internetBankingEnabled;
    private boolean mobileBankingEnabled;
    private double interestRate;
    private String modeOfOperation;//self operated or joint account

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public boolean isInternetBankingEnabled() {
        return internetBankingEnabled;
    }

    public void setInternetBankingEnabled(boolean internetBankingEnabled) {
        this.internetBankingEnabled = internetBankingEnabled;
    }

    public boolean isMobileBankingEnabled() {
        return mobileBankingEnabled;
    }

    public void setMobileBankingEnabled(boolean mobileBankingEnabled) {
        this.mobileBankingEnabled = mobileBankingEnabled;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    //method to debit cash
    public void debitCash(double amount) {
        if (accountStatus.equals("Active") && amount > 0 && amount <= totalBalance) {
            totalBalance -= amount;
            //availableBalance += amount;
            System.out.println(amount + " debited successfully");
        } else {
            System.out.println("Invalid debit request");
        }
    }

    // Method to credit cash
    public void creditCash(double amount) {
        if (accountStatus.equals("Active") && amount > 0) {
            totalBalance += amount;
            availableBalance += amount;
            System.out.println(amount + " credited successfully");
        } else {
            System.out.println("Invalid credit request");
        }
    }
}