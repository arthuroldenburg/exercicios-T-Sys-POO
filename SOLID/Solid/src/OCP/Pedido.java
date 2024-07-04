package OCP;

public class Pedido {
    private double valor;
    private Desconto desconto;

    public Pedido(double valor, Desconto desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public double calcularValorComDescotno(double valor) {
        return desconto.calcular(valor);
    }
}
