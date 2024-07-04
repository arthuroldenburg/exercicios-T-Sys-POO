package DIP;

public class CartaoDeCredito implements Pagamento{

    @Override
    public void pagamento(String valor) {
        System.out.println("O valor de: " + valor + " foi pago com Cartao de credito");
    }
}
