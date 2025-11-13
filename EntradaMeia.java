public class EntradaMeia extends Entrada {
    public EntradaMeia(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.5;
    }
}
