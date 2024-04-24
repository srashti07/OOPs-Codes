public class SavingAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    boolean accountStatus;

    //parameterized constructor
    public SavingAccount(long accountNumber, String accountHolderName,double accountBalance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountStatus =true; //account is active by default
    }
    //method to retrive account balance
    public double AccountBalance(){
        return accountBalance;
    }
    //method to debit cash
    public void debitCash(double amount)
    {
        if(accountStatus && amount > 0 && amount <= accountBalance){
            accountBalance -= amount;
            System.out.println(amount+"debit successfully");
        }
        else{
            System.out.println("Invalid debit request");
        }
    }
    //method to credit cash
    public void creditCash(double amount){
        if(accountStatus && amount > 0){
            accountBalance += amount;
            System.out.println(amount+"credited successfully");
        }
        else{
            System.out.println("Invalid credit request");
        }
    }
    //Method to check account status
    public boolean isAccountActive(){
        return accountStatus;
    }
}