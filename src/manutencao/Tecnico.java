package manutencao;

import java.io.Serializable;

public class Tecnico extends Pessoa implements Serializable {


    public Tecnico() {
        super();
    }

    public Tecnico(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public String toString() {
        String s =
                "Nome do Tecnico: " + getNome() + " \n" +
                        "Endereco: " + getEndereco() + " \n" +
                        "Telefone: " + getTelefone() + " \n" +
                        "CPF: " + getCpf() + " \n";
        return s;
    }
}
