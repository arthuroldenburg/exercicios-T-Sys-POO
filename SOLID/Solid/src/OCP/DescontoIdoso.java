package OCP;

public class DescontoIdoso extends Desconto{

    @Override
    double calcular(double valor) {
        return valor * 0.85;
    }
}
