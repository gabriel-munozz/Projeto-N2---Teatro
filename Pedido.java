import java.util.ArrayList;

public class Pedido {
    private ArrayList<Entrada> entradas = new ArrayList<>();

    public void adicionaEntrada(Entrada novaEntrada) {
        entradas.add(novaEntrada);
    }

    public double calculaValorTotal(double precoBase) {
        double total = 0;
        for (Entrada e : entradas) {
            total += e.calculaValor(precoBase);
        }
        return total;
    }
}
