package manutencao;
import java.util.Scanner;

public class TestaManutencao {

    public static void main(String[] args) {
        Interface inter = new Interface();
        Scanner scan = new Scanner(System.in);
        Aux aux = new Aux();
        int opcao = 0;
        ManipulaArquivo arq = new ManipulaArquivo();
        aux.lerArquivo();

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
                aux.realizarManutencao();
            } else if(opcao == 11) {
                aux.relatorioTecnico();
            } else if(opcao == 12) {
                aux.relatorioCliente();
            } else if(opcao == 13) {
                System.out.println("Volte sempre");
                aux.escreverArquivo();
            }

        } while(opcao != 13);

    }
}
