import java.util.Scanner;

public class main{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        do{
            System.out.println("***MACK THEATHER***");
            System.out.println("1.Cadastrar Espetáculo");
            System.out.println("2.Cadastrar Cliente");
            System.out.println("3.Compra de Entradas");
            System.out.println("4.Sair");
            System.out.print("Selecione uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
            
            case 1:
                
                break;
            
            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                System.out.print("Finalizando Sistema!");
                break;
            
            default: 
                System.out.println("Opção Inválida!");
        } while (opcao != 4);

    }
}