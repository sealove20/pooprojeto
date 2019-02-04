package manutencao;

import java.util.ArrayList;

public class Manutencao {

    Cliente cliente;
    Tecnico tecnico;
    ArrayList<Procedimento> procedimentos;
    String descricao;

    Manutencao() {}

    public Manutencao(Cliente cliente, Tecnico tecnico, ArrayList<Procedimento> procedimentos, String descricao) {
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.procedimentos = procedimentos;
        this.descricao = descricao;
    }



}
