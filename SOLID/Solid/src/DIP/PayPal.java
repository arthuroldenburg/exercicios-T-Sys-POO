package DIP;

public class PayPal implements Pagamento{
    @Override
    public void pagamento(String valor) {
        System.out.println("O valor de: " + valor + " foi pago com PayPal");
    }
}
