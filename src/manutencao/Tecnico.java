package manutencao;

import java.io.Serializable;

public class Tecnico extends Pessoa implements Serializable {
    private String especialidade;


    public Tecnico() {
        super();
    }

    public Tecnico(String nome, String endereco, String telefone, String cpf, String especialidade) {
        super(nome, endereco, telefone, cpf);
        this.especialidade = especialidade;
    }

    public String toString() {
        String s =
                "Nome do Tecnico: " + getNome() + " \n" +
                        "Endereco: " + getEndereco() + " \n" +
                        "Telefone: " + getTelefone() + " \n" +
                        "CPF: " + getCpf() + " \n" +
                        "Especialidade: " + getEspecialidade() + " \n";
        return s;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
