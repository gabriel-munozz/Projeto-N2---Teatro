public class entradaProfessor extends entrada {
    public entradaProfessor(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.7;
    }
}
