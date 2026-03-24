package util;

public class CurrencyConverter {

    public static double TAX = 0.06;

    public static double calculator(double amount, double dollarPrice) {
        return amount * dollarPrice * (1.0 + TAX);
    }

}

