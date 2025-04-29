package src;

public class CurrencyConverter {
    public double convert(double amount, double rate) {
        return amount * rate;
    }

    public boolean isValid(double amount, double rate) {
        return amount >= 0 && rate > 0;
    }
}
