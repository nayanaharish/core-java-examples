package corejava.oops.basics.example.bankaccountsimulation;

public class BankAccountPractice {
    public static void main(String[] args) {


        BankAccount b1 = new BankAccount(1000,"Nayana","NH10001");
        BankAccount b2 = new BankAccount(1000,"Harish","NH10002");
        BankAccount b3 = new BankAccount(1000,"Vineetha","NH10003");
        BankAccount b4 = new BankAccount(1000,"Adi","NH10004");

        System.out.println(b1.deposit(2000));
        System.out.println(b1.withdraw(2000));

    }
}
