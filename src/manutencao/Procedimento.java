package manutencao;

import java.util.Scanner;

public class Procedimento {
    private String codigo;
    private String nome;

    private Scanner scan = new Scanner(System.in);


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

    Procedimento lerProcedimento() {
        String codigoProcedimento, nomeProcedimento;
        System.out.println("Digite o código do procedimento");
        codigoProcedimento = scan.nextLine();
        System.out.println("Digite o nome do procedimento");
        nomeProcedimento = scan.nextLine();
        return new Procedimento(codigoProcedimento, nomeProcedimento);
    }

    public String toString() {
        String s =
                "Código do procedimento: " + getCodigo() + " \n" +
                "Nome do procedimento: " + getNome() + " \n";
        return s;
    }
}
