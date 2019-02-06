package manutencao;

import java.util.ArrayList;

public class Manutencao {

    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Procedimento> procedimentos;
    private String descricao;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setProcedimentos(ArrayList<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }


    public String getDescricao() {
        return descricao;
    }

    public ArrayList<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    Manutencao() {}

    public Manutencao(Cliente cliente, Tecnico tecnico, ArrayList<Procedimento> procedimentos, String descricao) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.procedimentos = procedimentos;
        this.descricao = descricao;
    }

    public String toString() {
        String s =
                "Nome do Cliente: " + getCliente() + " \n" +
                        "Técnico: " + getTecnico() + " \n" +
                        "Descricao: " + getDescricao() + " \n" +
                        "Procedimentos: \n";
                        for (Procedimento pro: procedimentos) {
                            s += "Código do procedimento: " + pro.getCodigo() + " -";
                            s += "Tipo de procedimento: " +pro.getNome() + " \n";
                        }
                        s += "******************************************************";
        return s;

    }
}
