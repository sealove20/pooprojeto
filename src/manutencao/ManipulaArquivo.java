package manutencao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ManipulaArquivo {

    public static ArrayList<Cliente> lerArquivoCliente(String arquivo) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Cliente c;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((c = (Cliente) in.readObject()) != null) {
                clientes.add(c);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return clientes;
    }

    public static ArrayList<Tecnico> lerArquivoTecnico(String arquivo) {
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Tecnico c;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((c = (Tecnico) in.readObject()) != null) {
                tecnicos.add(c);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return tecnicos;
    }

    public static ArrayList<Procedimento> lerArquivoProcedimento(String arquivo) {
        ArrayList<Procedimento> procedimentos = new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Procedimento c;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((c = (Procedimento) in.readObject()) != null) {
                procedimentos.add(c);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return procedimentos;
    }

    public static ArrayList<Manutencao> lerArquivoManutencao(String arquivo) {
        ArrayList<Manutencao> manutencaos= new ArrayList<>();
        FileInputStream fin;
        ObjectInputStream in;
        Manutencao c;
        try {
            fin = new FileInputStream(arquivo);
            in = new ObjectInputStream(fin);
            while((c = (Manutencao) in.readObject()) != null) {
                manutencaos.add(c);
            }
            in.close();
            fin.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
        }
        catch(Exception e) {
            // e.printStackTrace();
        }

        return manutencaos;
    }

    public static void escreverArquivoCliente(ArrayList<Cliente> clientes, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Cliente c: clientes)
                out.writeObject(c);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverArquivoTecnico(ArrayList<Tecnico> tecnicos, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Tecnico c: tecnicos)
                out.writeObject(c);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverArquivoManutencao(ArrayList<Manutencao> manutencaos, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Manutencao c: manutencaos)
                out.writeObject(c);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void escreverArquivoProcedimento(ArrayList<Procedimento> procedimentos, String arquivo) {
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(arquivo);
            ObjectOutputStream out;
            out = new ObjectOutputStream(fout);
            for(Procedimento c: procedimentos)
                out.writeObject(c);
            out.close();
            fout.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }


}
