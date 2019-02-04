package manutencao;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        Aux aux = new Aux();
        int opcao = 0;


        do {
            inter.desenhaMenu();
            opcao = scan.nextInt();
            if (opcao == 1) {
                aux.lerCliente();
            } else if (opcao == 2) {
                aux.lerTecnico();
            } else if (opcao == 3) {
                aux.lerProcedimento();
            } else if (opcao == 4) {
                aux.mostrarClientes();
            } else if (opcao == 5) {
                aux.mostrarTecnicos();
            } else if (opcao == 6) {
                aux.mostrarProcedimentos();
            } else if (opcao == 7) {
                aux.apagarCliente();
            } else if (opcao == 8) {
                aux.apagarTecnico();
            } else if (opcao == 9) {
                aux.apagarProcedimento();
            } else if (opcao == 10) {

            }

        } while(opcao != 13);

    }
}
