package sistema;

import model.Administrador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DadosAdministrador {
    static List<Administrador> administradores = new ArrayList<Administrador>();

    public static void DadosPreCadastradosAdministrador(String email, String senha, String telefone, String nome) {
        //Cadastrando Pedidos

        administradores.add(new Administrador("admin123", "admin123", "546546546", "James"));
        administradores.add(new Administrador("admin1", "admin1", "64555555555", "Curry"));
        administradores.add(new Administrador("admin", "admin", "4564654645", "Webert"));

    }

    public boolean validarLogin(String email, String senha) {
        boolean validador = false;
        DadosAdministrador dadosAdministrador = new DadosAdministrador();

        for (Administrador administrador : administradores) {
            if (email.equalsIgnoreCase(administrador.getEmail()) && senha.equalsIgnoreCase(administrador.getSenha())) {
                validador = true;
            }
        }
        return validador;
    }

    public static String[] adm1() {
        Administrador dadosAdm;
        String[] dados = new String[4];


        for (Administrador administrador : administradores) {
            if (administrador.getEmail().equalsIgnoreCase("admin"))
                dados[0] = administrador.getNome();
            dados[1] = administrador.getEmail();
            dados[2] = administrador.getTelefone();
            dados[3] = administrador.getSenha();
        }
        return dados;
    }

    public static String[] adm2() {
        Administrador dadosAdm;
        String[] dados = new String[4];

        for (Administrador administrador : administradores) {
            if (administrador.getEmail().equalsIgnoreCase("admin1"))
                dados[0] = administrador.getNome();
            dados[1] = administrador.getEmail();
            dados[2] = administrador.getTelefone();
            dados[3] = administrador.getSenha();
        }
        return dados;
    }

    public static String[] adm3() {
        Administrador dadosAdm;
        String[] dados = new String[4];

        for (Administrador administrador : administradores) {
            if (administrador.getEmail().equalsIgnoreCase("admin123"))
                dados[0] = administrador.getNome();
            dados[1] = administrador.getEmail();
            dados[2] = administrador.getTelefone();
            dados[3] = administrador.getSenha();
        }
        return dados;
    }
}
