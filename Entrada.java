public abstract class Entrada {
    private int numeroDoAssento;

    public Entrada(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public int getNumeroDoAssento() {
        return numeroDoAssento;
    }

    public abstract double calculaValor(double precoBase);
}