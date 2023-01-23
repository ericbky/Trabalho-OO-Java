package controller;

import model.*;
import sistema.BancoDados;
import sistema.DadosAdministrador;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    List<Administrador> administradores = new ArrayList<Administrador>();
    DadosAdministrador dadosAdministrador = new DadosAdministrador();

    public boolean verificarLogin(String emailLogin, String senhaLogin) throws ParseException {

        System.out.println("Nome: " + emailLogin + "\nSenha: " + senhaLogin + "\n|||||||||||||||||||||||||||||");

        boolean validador = dadosAdministrador.validarLogin(emailLogin, senhaLogin);
        if (validador == true) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, digite novamente!");
        }

        return validador;
    }
}
