package homeworks.hm17;

import homeworks.hm17.customExceptions.InsufficientFundsExceptions;
import homeworks.hm17.customExceptions.NegativeBalanceExceptions;

public abstract class Client {


    private String clientName;
    private double balance;
    private String operationInfo;


    public Client(String clientName, double balance) {
        this.clientName = clientName;
        this.balance = balance;
    }

    public double getBalance() {

        return balance;
    }
    public abstract void getDepositInfo();
    public abstract void getWithdrawalsInfo();

    public void withdrawals(double amount)throws InsufficientFundsExceptions, NegativeBalanceExceptions {

        if (balance < amount ) {
            throw new InsufficientFundsExceptions();
        }
        if (balance - amount < 0) {
            throw new NegativeBalanceExceptions();
        }
        if (balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
        }
    }
    public void setBalance(double amount) throws NegativeBalanceExceptions, InsufficientFundsExceptions {
        if(amount > balance){
            deposit(amount - balance);
        }else if(amount < balance){
            withdrawals(balance - amount);
        }

    }
}
