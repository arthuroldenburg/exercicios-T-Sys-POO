package OCP;

public class DescontoEstudande extends Desconto{
    @Override
    double calcular(double valor) {
        return valor * 0.9;
    }
}
