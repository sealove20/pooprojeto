package manutencao;
import java.util.Scanner;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;


        inter.desenhaMenu();
        opcao = scan.nextInt();

        if (opcao == 1) {
            String nome, endereco, telefone, cpf;
            System.out.println("Digite o nome do cliente");
            nome = scan.next();
            System.out.println("Digite o endereco do cliente");
            endereco = scan.next();

        }
        else if (opcao == 2)
            System.out.println("Interface de cadastro de técnicos");
        else if (opcao == 3)
            System.out.println("Interface de cadastro de procedimentos");

    }
}
