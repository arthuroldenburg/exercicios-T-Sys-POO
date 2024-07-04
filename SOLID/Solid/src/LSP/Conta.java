package LSP;

public class Conta {
    private int numero;
    private double saldo;
    private String nome;
    public String tipo;

    public Conta(int numero, double saldo, String nome, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void criarNovaConta(int numero, double saldo, String nome) {
        setNumero(numero);
        setSaldo(saldo);
        setNome(nome);
    }

    public String getNome() { return this.nome; }
    public int getNumero() { return this.numero; }
    public double getSaldo() {return saldo;}
    public void setNome(String nome) { this.nome = nome; }
    public void setNumero(int numero) { this.numero = numero; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public void setTipo() { this.tipo = "Conta"; }
}
