import java.util.Scanner;
public class SavingsAccount {
    long accountNumber;
    String account_holder_name;
    double account_balance;
    String account_status;
    Scanner sc;
    public void acceptDetails()
    {
        sc = new Scanner(System.in);
        System.out.println("Enter the accountNumber, Name, accountBalance, accountStatus ");
        accountNumber = sc.nextLong();
        account_holder_name = sc.next();
        account_balance = sc.nextDouble();
        account_status = sc.next();
    }
    public void display()

    {
        System.out.println(" accountNumber : \t" + accountNumber + "\t Name \t" + account_holder_name + "\t account balance \t" + account_balance + "\t status/t" + account_status);
    }
    public void withdrawCash(double amount)
    {
        if(account_status.equals("Active")&& account_balance >= amount)
        {
            account_balance -= amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public double checkBalance()
    {
        return account_balance;
    }
    public void depositCash(double amount)
    {
        if (account_status.equals("Active")){
            account_balance += amount;
        }
        else {
            System.out.println("Account is inactive");
        }
    }
    public void debitCash(double amount)
    {
        if(account_status.equals("Active")&& account_balance >= amount)
        {
            account_balance -= amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public void creditCash(double amount)
    {
        if(account_status.equals("Active")&& account_balance >= amount)
        {
            account_balance += amount;
        }
        else
        {
            System.out.println("Unable to credit cash");
        }
    }
    public double displayBalance( ){
        return account_balance;
    }
    public static void main(String[]arg)
    {
        SavingsAccount savingAccount = new SavingsAccount();
        savingAccount.acceptDetails();
        savingAccount.display();
        savingAccount.withdrawCash(10);
        double balanceAfterWithdrawal = savingAccount.checkBalance();
        System.out.println("Account balance after withdrawal: " + balanceAfterWithdrawal);
        savingAccount.depositCash(10);
        savingAccount.debitCash(30);
        savingAccount.creditCash(100);
        double finalBalance = savingAccount.displayBalance();
        System.out.println("Final account balance: " + finalBalance);
    }
}