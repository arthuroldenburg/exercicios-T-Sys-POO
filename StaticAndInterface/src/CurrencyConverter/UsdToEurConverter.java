package CurrencyConverter;

public class UsdToEurConverter implements CurrencyConverter{
    public void convert(double amount, String fromCurrency, String toCurrency) {
        double totalEur =  amount * 0.93;
        System.out.println(amount + " from " + fromCurrency + " to " + toCurrency + " = " + totalEur);
    }
}
