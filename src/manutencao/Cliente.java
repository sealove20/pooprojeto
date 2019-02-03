package manutencao;

import java.util.Scanner;

public class Cliente extends  Pessoa{

    Scanner scan = new Scanner(System.in);


    public Cliente() {
        super();
    }

    public Cliente(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    Cliente lerCliente() {
        System.out.println("Digite o nome do cliente");
        String nomeCliente = scan.nextLine();
        System.out.println("Digite o endereco do cliente");
        String enderecoCliente = scan.nextLine();
        System.out.println("Digite o telefone do cliente");
        String telefoneCliente = scan.nextLine();
        System.out.println("Digite o cpf do cliente");
        String cpfCliente = scan.nextLine();
        return new Cliente(nomeCliente, enderecoCliente, telefoneCliente, cpfCliente);
    }

    public String toString() {
        String s =
                "Nome do Cliente: " + getNome() + " \n" +
                "Endereco: " + getEndereco() + " \n" +
                "telefone: " + getTelefone() + " \n" +
                "cpf: " + getCpf() + " \n";
        return s;
    }
}
