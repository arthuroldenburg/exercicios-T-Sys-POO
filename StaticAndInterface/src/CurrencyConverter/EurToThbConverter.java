package CurrencyConverter;

public class EurToThbConverter implements CurrencyConverter {
    public void convert(double amount, String fromCurrency, String toCurrency) {
        double totalThb =  amount * 39.53;
        System.out.println(amount + " from " + fromCurrency + " to " + toCurrency + " = " + totalThb);
    }
}
