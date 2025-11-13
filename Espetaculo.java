public class Espetaculo {
    private String nome;
    private String data;
    private String hora;
    private double preco;
    private boolean[] assentos = new boolean[50];

    public Espetaculo(String nome, String data, String hora, double preco) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void apresentaAssentos() {
        for (int i = 49; i >= 0; i--) {
            if (assentos[i]){
                System.out.print("XX ");
            }else {
                System.out.printf("%02d ", i + 1);
            }
            if (i % 10 == 0){ 
                System.out.println();
            }
        }
    }

    public void marcarAssento(int assento) {
        if (assento >= 1 && assento <= 50)
            assentos[assento - 1] = true;
    }

    public Entrada novaEntrada(int tipo, int assento) {
    marcarAssento(assento);

    switch (tipo) {
        case 1:
            return new EntradaInteira(assento);
        case 2:
            return new EntradaMeia(assento);
        case 3:
            return new EntradaProfessor(assento);
        default:
            return null;
        }
    }

    public void mostrarEspetaculo() {
        System.out.printf("%s | %s | %s | R$%.2f%n", nome, data, hora, preco);
    }
}