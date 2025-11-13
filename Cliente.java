import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void adicionaPedido(Pedido novoPedido) {
        pedidos.add(novoPedido);
    }

    public void mostrarCliente() {
        System.out.printf("Cliente: %s | CPF: %s%n", nome, cpf);
    }
}


    
