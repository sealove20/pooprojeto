package manutencao;

import java.util.ArrayList;

public abstract class Relatorio {

    private ArrayList<Manutencao> manutencao;

    public Relatorio(ArrayList<Manutencao> manutencao) {
        this.manutencao = manutencao;
    }

    public Relatorio() {  }

    public ArrayList<Manutencao> getManutencao() {
        return manutencao;
    }

    public void setManutencao(ArrayList<Manutencao> manutencao) {
        this.manutencao = manutencao;
    }
}
