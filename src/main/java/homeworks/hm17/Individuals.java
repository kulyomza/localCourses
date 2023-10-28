package homeworks.hm17;

import homeworks.hm17.customExceptions.InsufficientFundsExceptions;
import homeworks.hm17.customExceptions.NegativeBalanceExceptions;

public class Individuals extends Client {


    public Individuals(String clientName, double balance) {
        super(clientName, balance);

    }


    @Override
    public void getDepositInfo() {
        System.out.println("Deposit occur without commission.");
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public void getWithdrawalsInfo() {
        System.out.println("Withdrawals occur without commission.");
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public void withdrawals(double amount) throws InsufficientFundsExceptions, NegativeBalanceExceptions {
        super.withdrawals(amount);
    }

    @Override
    public void deposit(double amount){
        super.deposit(amount);

    }



}

