public abstract class entrada {
    protected int numeroDoAssento;

    public entrada(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public int getNumeroDoAssento() {
        return numeroDoAssento;
    }

    public abstract double calculaValor(double precoBase);
}
