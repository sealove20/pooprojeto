package manutencao;

import java.io.Serializable;

public class Cliente  extends Pessoa  implements Serializable {
    private double renda;

    public Cliente() {
        super();
    }

    public Cliente(String nome, String endereco, String telefone, String cpf, double renda) {
        super(nome, endereco, telefone, cpf);
        this.renda = renda;
    }

    public String toString() {
        String s =
                "Nome do Cliente: " + getNome() + " \n" +
                "Endereco: " + getEndereco() + " \n" +
                "Telefone: " + getTelefone() + " \n" +
                "CPF: " + getCpf() + " \n" +
                "Renda: " + getRenda() + " \n";
        return s;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
}
