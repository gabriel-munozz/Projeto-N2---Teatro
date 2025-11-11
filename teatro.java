import java.util.ArrayList;
import java.util.Scanner;

public class teatro {
    private ArrayList<espetaculo> espetaculos = new ArrayList<>();
    private ArrayList<cliente> clientes = new ArrayList<>();
    private Scanner entrada = new Scanner(System.in);

    public void cadastrarEspetaculo() {
        System.out.println("\n*** CADASTRO DE ESPETÁCULO ***");
        System.out.print("Nome do Espetáculo: ");
        String nome = entrada.nextLine();
        System.out.print("Data: ");
        String data = entrada.nextLine();
        System.out.print("Hora: ");
        String hora = entrada.nextLine();
        System.out.print("Preço da Entrada Inteira: ");
        double preco = entrada.nextDouble();
        entrada.nextLine();

        espetaculos.add(new espetaculo(nome, data, hora, preco));
        System.out.println("Espetáculo cadastrado com sucesso!");
    }

    public void cadastrarCliente() {
        System.out.println("\n*** CADASTRO DE CLIENTE ***");
        System.out.print("Nome do Cliente: ");
        String nome = entrada.nextLine();
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();

        clientes.add(new cliente(nome, cpf));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void novaCompra() {
        if (espetaculos.isEmpty()) {
            System.out.println("Nenhum espetáculo cadastrado!");
            return;
        }

        System.out.println("\n*** VENDA DE ENTRADAS - ESPETÁCULOS ***");
        for (int i = 0; i < espetaculos.size(); i++) {
            System.out.printf("%d.", (i + 1));
            espetaculos.get(i).mostrarEspetaculo();
        }

        System.out.print("Selecione um espetáculo: ");
        int escolha = entrada.nextInt();
        entrada.nextLine();

        if (escolha < 1 || escolha > espetaculos.size()) {
            System.out.println("Espetáculo inválido!");
            return;
        }

        espetaculo esp = espetaculos.get(escolha - 1);
        pedido pedido = new pedido();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n***Assentos Disponíveis***");
            esp.apresentaAssentos();

            System.out.print("Selecione o assento: ");
            int assento = entrada.nextInt();
            entrada.nextLine();

            System.out.println("\n1. Inteira\n2. Meia\n3. Professor");
            System.out.print("Tipo da entrada: ");
            int tipo = entrada.nextInt();
            entrada.nextLine();

            entrada novaEntrada = esp.novaEntrada(tipo, assento);
            pedido.adicionaEntrada(novaEntrada);

            System.out.print("Deseja comprar outra entrada (S/N)? ");
            String resp = entrada.nextLine();
            if (resp.equalsIgnoreCase("N")) continuar = false;
        }

        System.out.print("Informe o CPF do cliente: ");
        String cpf = entrada.nextLine();
        cliente cli = buscarClientePorCpf(cpf);
        if (cli == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        cli.adicionaPedido(pedido);
        double total = pedido.calculaValorTotal(esp.getPreco());
        System.out.printf("Valor Total: R$ %.2f%n", total);
    }

    private cliente buscarClientePorCpf(String cpf) {
        for (cliente c : clientes) {
            if (c.getCpf().equals(cpf)) return c;
        }
        return null;
    }
}
