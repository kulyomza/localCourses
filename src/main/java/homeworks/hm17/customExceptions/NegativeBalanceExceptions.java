package homeworks.hm17.customExceptions;

public class NegativeBalanceExceptions extends Exception{
    public NegativeBalanceExceptions() {
        super("Ошибка: Отрицательный баланс не допускается.");
    }
}
