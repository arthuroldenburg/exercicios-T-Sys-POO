package LSP;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, double saldo, String nome, String tipo) {
        super(numero, saldo, nome, tipo);
    }

    @Override
    public void setTipo() {this.tipo = "Poupanca";}
}
