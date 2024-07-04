package SRP;

import java.util.ArrayList;

public class Relatorio {
    private ArrayList<String> vendas = new ArrayList<>();

    public void imprimirRelatorio() {
        System.out.println("Teve o total de: " + gerarRelatorio() + "vendas!");
    }

    public int gerarRelatorio() {
        int totalVendas = 0;
        for (String venda : vendas) {
            totalVendas++;
        }
        return totalVendas;
    }
}
