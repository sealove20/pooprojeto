package manutencao;

import java.util.ArrayList;

public class RelatorioCliente extends Relatorio {

    public RelatorioCliente(ArrayList<Manutencao> manutencao) {
        super(manutencao);
    }

    public RelatorioCliente() { }

    public void mostrarRelatorioCliente(ArrayList<Cliente> clientes) {
        for(Manutencao manu : getManutencao()) {
            for(Cliente cli : clientes)
                if(manu.getCliente().getNome().equals(cli.getNome())){
                    System.out.println("O cliente: " + manu.getCliente());
                    System.out.println(manu.getDescricao());
                }

        }
    }
}
