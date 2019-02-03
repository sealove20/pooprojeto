package manutencao;

import java.util.Scanner;

public class Interface {

    public void desenhaMenu() {
        System.out.println("1  - Cadastro de Clientes");
        System.out.println("2  - Cadastro de Técnicos");
        System.out.println("3  - Cadastro de Procedimentos");
        System.out.println("4  - Listar Clientes");
        System.out.println("5  - Listar Técnicos");
        System.out.println("6  - Listar Procedimentos");
        System.out.println("7  - Apagar Cliente");
        System.out.println("8  - Apagar Técnico");
        System.out.println("9  - Apagar Procedimento");
        System.out.println("10 - Realizar Manutenção");
        System.out.println("11 - Relatório de manutenções por técnicos");
        System.out.println("12 - Relatório de clientes e suas manutenções");
        System.out.println("13 - Sair");
    }

    public void desenhaCabecalhoListaClientes() {
        System.out.println("***** LISTA DE CLIENTES CADASTRADOS *****");
    }
}
