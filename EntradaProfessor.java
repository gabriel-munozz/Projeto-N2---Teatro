public class EntradaProfessor extends Entrada {
    public EntradaProfessor(int numeroDoAssento) {
        super(numeroDoAssento);
    }

    public double calculaValor(double precoBase) {
        return precoBase * 0.4;
    }
}