package manutencao;

import java.util.ArrayList;
import java.util.Scanner;

public class Aux {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Tecnico> tecnicos = new ArrayList<>();
    ArrayList<Procedimento> procedimentos = new ArrayList<>();
    ArrayList<Manutencao> manutencoes= new ArrayList<>();

    Scanner scan = new Scanner(System.in);


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
        Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente, cpfCliente);
        clientes.add(cliente);
    }

    public void lerTecnico() {
        System.out.println("*** CADASTRO DE TÉCNICO ***");
        String nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico;
        System.out.println("Digite o nome do técnico");
        nomeTecnico = scan.nextLine();
        System.out.println("Digite o endereco do técnico");
        enderecoTecnico = scan.nextLine();
        System.out.println("Digite o telefone do técnico");
        telefoneTecnico = scan.nextLine();
        System.out.println("Digite o cpf do técnico");
        cpfTecnico = scan.nextLine();
        Tecnico tecnico = new Tecnico(nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico);
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
        for (Procedimento proc : procedimentos) {
            System.out.println(i + " - " + proc.getNome());
            i++;
        }

        System.out.println("Escolha um cliente para deletar");
        int op = scan.nextInt();
        procedimentos.remove(op);
        System.out.println("Ação realizada com sucesso");
    }

    public void realizarManutencao() {
        Cliente cliente;
        Tecnico tecnico;
        Procedimento procedimento;

        int i = 0;
        for (Cliente cli : clientes) {
            System.out.println(i + " - " + cli.getNome());
            i++;
        }

        System.out.println("Escolha o cliente");
        int op = scan.nextInt();
        cliente = clientes.get(op);
        System.out.println("Ação realizada com sucesso");
    }
}
