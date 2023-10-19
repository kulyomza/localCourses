package homeworks.hm13.customException;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super("Ошибка: Недостаточно средств на счету.");
    }
}
