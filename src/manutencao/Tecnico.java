package manutencao;

import java.util.Scanner;

public class Tecnico extends Pessoa {

    Scanner scan = new Scanner(System.in);

    public Tecnico() {
        super();
    }

    public Tecnico(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    Tecnico lerTecnico() {
        String nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico;
        System.out.println("Digite o nome do técnico");
        nomeTecnico = scan.nextLine();
        System.out.println("Digite o endereco do técnico");
        enderecoTecnico = scan.nextLine();
        System.out.println("Digite o telefone do técnico");
        telefoneTecnico = scan.nextLine();
        System.out.println("Digite o cpf do técnico");
        cpfTecnico = scan.nextLine();
        return new Tecnico(nomeTecnico, enderecoTecnico, telefoneTecnico, cpfTecnico);
    }
}
