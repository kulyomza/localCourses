package lessons.lesson12.enumExample;

public enum CountryCurrency {
    CANADA("DOL"),
    POLAND("ZLT"),
    UKRAINE("UAH"),
    GERMANY;

    String currency;

    CountryCurrency(String currency) {
        this.currency = currency;
    }
    CountryCurrency(){

    }
}
