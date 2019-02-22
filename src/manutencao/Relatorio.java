package manutencao;

import java.util.ArrayList;

public class Relatorio {


    public void relatorioCliente(ArrayList<Cliente> clientes, ArrayList<Manutencao> manutencoes) {
        for (Cliente cli : clientes) {
            System.out.println("O cliente " + cli.getNome() + " Solicitou: ");
            for (Manutencao manu: manutencoes)
                if (manu.getCliente().getNome().equals(cli.getNome()))
                    System.out.println(manu);
        }
    }

    public void relatorioTecnico(ArrayList<Tecnico> tecnicos, ArrayList<Manutencao> manutencoes) {
        for(Tecnico tec : tecnicos) {
            System.out.println("O Técnico " + tec.getNome() + " Realizou: ");
            for(Manutencao manu: manutencoes)
                if(manu.getTecnico().getNome().equals(tec.getNome()))
                    System.out.println(manu);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    }

}
