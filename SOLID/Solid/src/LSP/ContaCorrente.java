package LSP;

public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, double saldo, String nome, String tipo) {
        super(numero, saldo, nome, tipo);
    }

    @Override
    public void setTipo() {this.tipo = "Corrente";}

}
