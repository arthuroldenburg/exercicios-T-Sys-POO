package ISP;

public class Impressora implements ImprimirDocumento, EscanearDocumento, FaxearDocumento{

    @Override
    public void escanerarDocumento() {
        System.out.println("Escaneando Documento");
    }

    @Override
    public void faxearDocumento() {
        System.out.println("Faxeando Documento");
    }

    @Override
    public void imprimirDocumento() {
        System.out.println("Imprimindo Documento");
    }
}
