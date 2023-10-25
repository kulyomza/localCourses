package homeworks.hm13.customException;

public class NegativeBalanceException extends Exception{

    public NegativeBalanceException() {
        super("Ошибка: Отрицательный баланс не допускается.");
    }
}
