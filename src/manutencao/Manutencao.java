package manutencao;

import java.io.Serializable;
import java.util.ArrayList;

public class Manutencao implements Serializable {

    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Procedimento> procedimentos;
    private String descricao;

    public Manutencao(Cliente cliente, Tecnico tecnico, ArrayList<Procedimento> procedimentos, String descricao) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.procedimentos = procedimentos;
        this.descricao = descricao;
    }

    Manutencao() {}

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


    public String toString() {
        String s =
                getCliente() + " \n" +
                        getTecnico() + " \n" +
                        "Descrição: " + getDescricao() + " \n" ;
                        for (Procedimento pro: procedimentos) {
                            s += "Código do procedimento: " + pro.getCodigo() + " -";
                            s += "Tipo de procedimento: " +pro.getNome() + " \n";
                        }
                        s += "******************************************************";
        return s;

    }
}
