package homeworks.hm13;

import homeworks.hm13.customException.InsufficientFundsException;
import homeworks.hm13.customException.NegativeBalanceException;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeBalanceException {

        if (balance < amount ) {
            throw new InsufficientFundsException();
        }
        if (balance - amount < 0) {
            throw new NegativeBalanceException();
        }
        if (balance >= amount) {
            balance -= amount;
        }

    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public void transferTo(BankAccount accountNumber, double amount) throws NegativeBalanceException, InsufficientFundsException {
        this.withdraw(amount);
        accountNumber.deposit(amount);
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double newBalance){
         this.balance = newBalance;
    }

}
