package homeworks.hm17;

import homeworks.hm17.customExceptions.InsufficientFundsExceptions;
import homeworks.hm17.customExceptions.NegativeBalanceExceptions;

public class LegalEntities extends Client {


    public LegalEntities(String clientName, double balance) {
        super(clientName, balance);
    }

    @Override
    public void getDepositInfo() {
        System.out.println("Deposit occur without commission.");
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public void getWithdrawalsInfo() {
        System.out.println("Withdrawal of funds comes with a commission of 1% of the withdrawal amount.");
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public void withdrawals(double amount) throws InsufficientFundsExceptions, NegativeBalanceExceptions {
        if (getBalance() < amount ) {
            throw new InsufficientFundsExceptions();
        }
        if (getBalance() - amount < 0) {
            throw new NegativeBalanceExceptions();
        }
        if (getBalance() >= amount) {
            double commission = amount * 0.01;
            super.withdrawals(amount * 1.01);
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

}
