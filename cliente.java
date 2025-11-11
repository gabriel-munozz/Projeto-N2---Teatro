import java.util.ArrayList;

public class cliente {
    private String nome;
    private String cpf;
    private ArrayList<pedido> pedidos = new ArrayList<>();

    public cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionaPedido(pedido pedido) {
        pedidos.add(pedido);
    }

    public String toString() {
        return nome + " (CPF: " + cpf + ")";
    }
}
