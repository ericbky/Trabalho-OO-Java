package sistema;

import model.Administrador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DadosAdministrador {
    static List<Administrador> administradores = new ArrayList<Administrador>();

    public static void DadosPreCadastradosAdministrador(String email, String senha, String telefone, String nome) {
        //Cadastrando Pedidos

        administradores.add(new Administrador("admin123", "admin123", "546546546", "Em processo"));
        administradores.add(new Administrador("admin1", "admin1", "64555555555", "Concluído"));
        administradores.add(new Administrador("admin", "admin", "4564654645", "Agendado"));

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

    static public boolean pesquisarAdministrador(String nome) {
        boolean validador = false;

        for (Administrador administrador : administradores) {
            if (nome.equalsIgnoreCase(administrador.getNome())) {
                validador = true;
            }
        }
        return validador;
    }
}
