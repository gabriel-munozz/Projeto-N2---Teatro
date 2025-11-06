import java.util.Scanner;

public class main{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        System.out.println("***MACK THEATHER***");
        System.out.println("1.Cadastrar Espetáculo");
        System.out.println("2.Cadastrar Cliente");
        System.out.println("3.Compra de Entradas");
        System.out.println("4.Sair");
        System.out.print("Selecione uma opção: ");
        opcao = entrada.nextInt();
    }
}