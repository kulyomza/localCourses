package homeworks.hm17;

import homeworks.hm17.customExceptions.InsufficientFundsExceptions;
import homeworks.hm17.customExceptions.NegativeBalanceExceptions;

public class IndividualEntrepreneurs extends Client {


    public IndividualEntrepreneurs(String clientName, double balance) {
        super(clientName, balance);
    }


    @Override
    public void getDepositInfo() {
        System.out.println("Deposit with a commission of 1%, if the amount is less than 1000,if more than 1000 - 0.5.");
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
    public void deposit(double amount) {
        if(amount > 1000){
            double commission = amount * 0.005;
            super.deposit(amount - commission);
        }else if (amount > 0 && amount < 1000){
            double commission = amount * 0.01;
            super.deposit(amount - commission);

        }
    }

}
