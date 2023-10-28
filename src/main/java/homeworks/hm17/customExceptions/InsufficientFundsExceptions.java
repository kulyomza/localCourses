package homeworks.hm17.customExceptions;

public class InsufficientFundsExceptions extends Exception{

    public InsufficientFundsExceptions() {
        super("Ошибка: Недостаточно средств на счету.");
    }
}
