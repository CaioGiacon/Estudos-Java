package entities;

public class CurrencyConverter {
    public static double dolarPrice;
    public static double dolarAmount;

    public static double moneyConverter() {
        return dolarPrice * dolarAmount;
    }

    public static double rawMoney() {
        return moneyConverter() + (moneyConverter() * (6.0 / 100));
    }
}
