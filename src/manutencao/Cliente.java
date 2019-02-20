package manutencao;

import java.io.Serializable;

public class Cliente  extends Pessoa  implements Serializable {

    public Cliente() {
        super();
    }

    public Cliente(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone, cpf);
    }

    public String toString() {
        String s =
                "Nome do Cliente: " + getNome() + " \n" +
                "Endereco: " + getEndereco() + " \n" +
                "Telefone: " + getTelefone() + " \n" +
                "CPF: " + getCpf() + " \n";
        return s;
    }
}
