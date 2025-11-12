public class entradaMeia extends entrada {
    public entradaMeia(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.5;
    }
}
