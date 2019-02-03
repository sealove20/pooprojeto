package manutencao;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<Procedimento> procedimentos = new ArrayList<>();
        Cliente cliente = new Cliente();
        Tecnico tecnico = new Tecnico();
        Procedimento procedimento = new Procedimento();
        int opcao = 0;


        do {
            inter.desenhaMenu();
            opcao = scan.nextInt();
            if (opcao == 1) {
                clientes.add(cliente.lerCliente());
            } else if (opcao == 2) {
                tecnicos.add(tecnico.lerTecnico());
            } else if (opcao == 3) {
                procedimentos.add(procedimento.lerProcedimento());
            } else if (opcao == 6) {
                System.out.println(clientes.size());
                for (Cliente cli: clientes)
                    System.out.println(cli);
            }

        } while(opcao != 7);

    }
}
