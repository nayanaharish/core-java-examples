package corejava.oops.basics.example.bankaccountsimulation;

public class BankAccount {
    private double balance;
    private String accountHolderName;
    private String accountNumber;


    public BankAccount(double balance, String accountHolderName, String accountNumber) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public String deposit(double amount) {

        this.balance += amount;
        return "Account is debited with the amount " + amount+" Your current balance is " + balance;


    }

    public String withdraw(double amount) {

        this.balance -= amount;
        return "Account is withdrawn with the amount " + amount + " Your current balance is " + balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
