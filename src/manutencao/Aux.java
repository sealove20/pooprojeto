// Classe criada para manipular dados das classes, inicializar-las e manipular arquivos;
package manutencao;

import java.util.ArrayList;
import java.util.Scanner;

public class Aux {

    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cliente> clientesArq;
    private ArrayList<Tecnico> tecnicos = new ArrayList<>();
    private ArrayList<Procedimento> procedimentos = new ArrayList<>();
    private ArrayList<Manutencao> manutencoes= new ArrayList<>();
    private ManipulaArquivo mani;


    private Scanner scan = new Scanner(System.in);
    private String arquivoCliente = "clientes.bin";
    private String arquivoTecnico = "tecnicos.bin";
    private String arquivoProcedimento = "procedimentos.bin";
    private String arquivoManutencao = "manutencao.bin";


    public void lerCliente() {
        System.out.println("*** CADASTRO DE CLIENTE ***");
        System.out.println("Digite o nome do cliente");
        String nomeCliente = scan.nextLine();
        System.out.println("Digite o endereco do cliente");
        String enderecoCliente = scan.nextLine();
        System.out.println("Digite o telefone do cliente");
        String telefoneCliente = scan.nextLine();
        System.out.println("Digite o cpf do cliente");
        String cpfCliente = scan.nextLine();
        System.out.println("Digite a renda do cliente");
        double rendaCliente = scan.nextDouble();
        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente, cpfCliente, rendaCliente);
        clientes.add(cliente);
    }

    public void lerTecnico() {
        System.out.println("*** CADASTRO DE TÉCNICO ***");
        scan.nextLine();
        System.out.println("Digite o nome do técnico");
        String nomeTecnico = scan.nextLine();
        System.out.println("Digite o endereco do técnico");
        String enderecoTecnico = scan.nextLine();
        System.out.println("Digite o telefone do técnico");
        String telefoneTecnico = scan.nextLine();
        System.out.println("Digite o cpf do técnico");
        String cpfTecnico = scan.nextLine();
        System.out.println("Digite a especialidade do técnico");
        String especialidadeTecnico = scan.nextLine();
        Tecnico tecnico = new Tecnico(nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico, especialidadeTecnico);
        tecnicos.add(tecnico);
    }

    public void lerProcedimento() {
        System.out.println("*** CADASTRO DE PROCEDIMENTO ***");
        String codigoProcedimento, nomeProcedimento;
        System.out.println("Digite o código do procedimento");
        codigoProcedimento = scan.nextLine();
        System.out.println("Digite o nome do procedimento");
        nomeProcedimento = scan.nextLine();
        Procedimento procedimento = new Procedimento(codigoProcedimento, nomeProcedimento);
        procedimentos.add(procedimento);
    }

    public void mostrarClientes() {
        System.out.println("***** LISTA DE CLIENTES CADASTRADOS *****");
        for (Cliente cli: clientes)
            System.out.println(cli);
    }

    public void mostrarTecnicos() {
        System.out.println("***** LISTA DE TÉCNICOS CADASTRADOS *****");
        for (Tecnico tec: tecnicos)
            System.out.println(tec);
    }

    public void mostrarProcedimentos() {
        System.out.println("***** LISTA DE PROCEDIMENTOS CADASTRADOS *****");
        for (Procedimento proc: procedimentos)
            System.out.println(proc);
    }

    public void apagarCliente() {
        int i = 0;
        // Percorre o ArrayList e plota 1 menu com todos os clientes cadastrados
        for (Cliente cli : clientes) {
            System.out.println(i + " - " + cli.getNome());
            i++;
        }
        System.out.println("Escolha um cliente para deletar");
        int op = scan.nextInt();
        clientes.remove(op);
        System.out.println("Ação realizada com sucesso");
    }

    public void apagarTecnico() {
        int i = 0;
        // Percorre o ArrayList e plota 1 menu com todos os técnicos cadastrados
        for (Tecnico tec : tecnicos) {
            System.out.println(i + " - " + tec.getNome());
            i++;
        }

        System.out.println("Escolha um técnico para deletar");
        int op = scan.nextInt();
        tecnicos.remove(op);
        System.out.println("Ação realizada com sucesso");
    }

    public void apagarProcedimento() {
        int i = 0;
        // Percorre o ArrayList e plota 1 menu com todos os procedimentos cadastrados
        for (Procedimento proc : procedimentos) {
            System.out.println(i + " - " + proc.getNome());
            i++;
        }

        System.out.println("Escolha um procedimento para deletar");
        int op = scan.nextInt();
        procedimentos.remove(op);
        System.out.println("Ação realizada com sucesso");
    }

    public void realizarManutencao() {
        Manutencao manutencao = new Manutencao();

        int i = 0;
        for (Cliente cli : clientes) {
            System.out.println(i + " - " + cli.getNome());
            i++;
        }

        System.out.println("Escolha o cliente");
        int op = scan.nextInt();
        manutencao.setCliente(clientes.get(op));

        i = 0;
        for (Tecnico tec : tecnicos) {
            System.out.println(i + " - " + tec.getNome());
            i++;
        }

        System.out.println("Escolha o técnico");
        op = scan.nextInt();
        manutencao.setTecnico(tecnicos.get(op));

        int opProcedimentos = 0;
        ArrayList<Procedimento> listaProcedimentosManutencao = new ArrayList<>();
        do {

            i = 0;
            for (Procedimento proc : procedimentos) {
                System.out.println(i + " - " + proc.getNome());
                i++;
            }

            System.out.println("Escolha um procedimento");
            op = scan.nextInt();
            listaProcedimentosManutencao.add(procedimentos.get(op));

            System.out.println("Deseja adicionar mais procedimentos?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opProcedimentos = scan.nextInt();

        } while(opProcedimentos != 2);
        manutencao.setProcedimentos(listaProcedimentosManutencao);

        System.out.println("Digite a descrição da manutenção");
        scan.nextLine();
        String descricao = scan.nextLine();
        manutencao.setDescricao(descricao);

        System.out.println("Manutenção cadastrada com sucesso");
        manutencoes.add(manutencao);
    }

    public void relatorioCliente() {
        Relatorio relatorio = new Relatorio();
        relatorio.relatorioCliente(clientes, manutencoes);
    }

    public void relatorioTecnico() {
        Relatorio relatorio = new Relatorio();
        relatorio.relatorioTecnico(tecnicos, manutencoes);
    }

    public void escreverArquivo() {
        mani.escreverArquivoCliente(clientes, arquivoCliente);
        mani.escreverArquivoTecnico(tecnicos, arquivoTecnico);
        mani.escreverArquivoProcedimento(procedimentos, arquivoProcedimento);
        mani.escreverArquivoManutencao(manutencoes, arquivoManutencao);

    }

    public void lerArquivo() {
        clientes = mani.lerArquivoCliente(arquivoCliente);
        tecnicos = mani.lerArquivoTecnico(arquivoTecnico);
        procedimentos = mani.lerArquivoProcedimento(arquivoProcedimento);
        manutencoes = mani.lerArquivoManutencao(arquivoManutencao);
    }
}
