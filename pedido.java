import java.util.ArrayList;

public class pedido {
    private ArrayList<entrada> entradas = new ArrayList<>();

    public void adicionaEntrada(entrada entrada) {
        entradas.add(entrada);
    }

    public double calculaValorTotal(double precoBase) {
        double total = 0;
        for (entrada e : entradas) {
            total += e.calculaValor(precoBase);
        }
        return total;
    }
}

