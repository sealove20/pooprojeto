package manutencao;
import java.util.Scanner;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        int opcao = 0;


        do {
            inter.desenhaMenu();
            opcao = scan.nextInt();

            if (opcao == 1) {
                String nomeCliente, enderecoCliente, telefoneCliente, cpfCliente;
                System.out.println("Digite o nome do cliente");
                nomeCliente = scan.next();
                System.out.println("Digite o endereco do cliente");
                enderecoCliente = scan.next();
                System.out.println("Digite o telefone do cliente");
                telefoneCliente = scan.next();
                System.out.println("Digite o cpf do cliente");
                cpfCliente = scan.next();
                Cliente novoCliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente, cpfCliente);


            } else if (opcao == 2) {
                String nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico;
                System.out.println("Digite o nome do técnico");
                nomeTecnico = scan.next();
                System.out.println("Digite o endereco do técnico");
                enderecoTecnico = scan.next();
                System.out.println("Digite o telefone do técnico");
                telefoneTecnico = scan.next();
                System.out.println("Digite o cpf do técnico");
                cpfTecnico = scan.next();
                Tecnico novoTecnico = new Tecnico(nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico);

            }
            else if (opcao == 3) {
                String codigoProcedimento, nomeProcedimento;
                System.out.println("Digite o código do procedimento");
                codigoProcedimento = scan.next();
                System.out.println("Digite o nome do procedimento");
                nomeProcedimento = scan.next();
                Procedimento procedimento = new Procedimento(codigoProcedimento, nomeProcedimento);
            }
        } while(opcao != 7);

    }
}
