package manutencao;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente cliente = new Cliente();
        int opcao = 0;


        do {
            inter.desenhaMenu();
            opcao = scan.nextInt();
            if (opcao == 1) {
//                cliente = cliente.lerCliente();
                clientes.add(cliente.lerCliente());

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

            } else if (opcao == 3) {
                String codigoProcedimento, nomeProcedimento;
                System.out.println("Digite o código do procedimento");
                codigoProcedimento = scan.next();
                System.out.println("Digite o nome do procedimento");
                nomeProcedimento = scan.next();
                Procedimento procedimento = new Procedimento(codigoProcedimento, nomeProcedimento);
            } else if (opcao == 6) {
                System.out.println(clientes.size());
                for (Cliente cli: clientes)
                    System.out.println(cli);
            }

        } while(opcao != 7);

    }
}
