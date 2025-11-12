public class cliente {
    private String nome;
    private String cpf;
    private pedido[] pedidos = new pedido[50];
    private int qtdPedidos = 0;

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

    public void adicionaPedido(pedido novoPedido) {
        if (qtdPedidos < pedidos.length) {
            pedidos[qtdPedidos] = novoPedido;
            qtdPedidos++;
        } else {
            System.out.println("Limite máximo de pedidos atingido para este cliente!");
        }
    }

    public void mostrarCliente() {
    System.out.printf("Cliente: %s | CPF: %s%n", nome, cpf);
    }
}
