public class entradaMeia extends entrada {
    public entradaMeia(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.5;
    }
}
