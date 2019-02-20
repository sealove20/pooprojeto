package manutencao;

import java.io.Serializable;

public class Procedimento implements Serializable {
    private String codigo;
    private String nome;

    public Procedimento(){}

    public Procedimento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        String s =
                "Código do procedimento: " + getCodigo() + " \n" +
                "Nome do procedimento: " + getNome() + " \n";
        return s;
    }
}
