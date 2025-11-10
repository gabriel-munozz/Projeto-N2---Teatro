public class entradaProfessor extends entrada {
    public entradaProfessor(int numeroDoAssento) {
        this.numeroDoAssento = numeroDoAssento;
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.6;
    }
}
