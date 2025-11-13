public class EntradaInteira extends Entrada {
    public EntradaInteira(int numeroDoAssento) {
        super(numeroDoAssento); 
    }

    public double calculaValor(double precoBase) {
        return precoBase;
    }
}