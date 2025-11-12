public class pedido {
    private entrada[] entradas = new entrada[50];
    private int qtdEntradas = 0;

    public void adicionaEntrada(entrada novaEntrada) {
        if (qtdEntradas < entradas.length) {
            entradas[qtdEntradas] = novaEntrada;
            qtdEntradas++;
        } else {
            System.out.println("Limite máximo de entradas atingido!");
        }
    }

    public double calculaValorTotal(double precoBase) {
        double total = 0;
        for (int i = 0; i < qtdEntradas; i++) {
            total += entradas[i].calculaValor(precoBase);
        }
        return total;
    }
}
