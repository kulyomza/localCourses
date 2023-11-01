package homeworks.hm17;

import homeworks.hm17.customExceptions.InsufficientFundsExceptions;
import homeworks.hm17.customExceptions.NegativeBalanceExceptions;

public class Main {
    public static void main(String[] args) {
        Individuals individuals = new Individuals("Maks", 1000.00);
        LegalEntities legalEntities = new LegalEntities("Alex", 5000.00);
        IndividualEntrepreneurs individualEntrepreneurs = new IndividualEntrepreneurs("Sergey", 3000.00);

        try {
            individuals.withdrawals(100.00);
        } catch (InsufficientFundsExceptions e) {
            e.printStackTrace();
        } catch (NegativeBalanceExceptions e) {
            e.printStackTrace();
        }
        individuals.getWithdrawalsInfo();
        individuals.deposit(300.00);
        individuals.getDepositInfo();


        try {
            legalEntities.withdrawals(500.00);
        } catch (InsufficientFundsExceptions e) {
            e.printStackTrace();
        } catch (NegativeBalanceExceptions e) {
            e.printStackTrace();
        }
        legalEntities.getWithdrawalsInfo();
        legalEntities.deposit(1000.00);
        legalEntities.getDepositInfo();


        individualEntrepreneurs.deposit(500.00);
        individualEntrepreneurs.getDepositInfo();
        individualEntrepreneurs.deposit(1050.00);
        individualEntrepreneurs.getDepositInfo();
        try {
            individualEntrepreneurs.withdrawals(2000.00);
        } catch (InsufficientFundsExceptions e) {
            e.printStackTrace();
        } catch (NegativeBalanceExceptions e) {
            e.printStackTrace();
        }
        individualEntrepreneurs.getWithdrawalsInfo();

    }
}


