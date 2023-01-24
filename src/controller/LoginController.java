package controller;

import model.*;
import sistema.DadosAdministrador;
import sistema.DadosFuncionario;
import view.Tela_Adm;
import view.Tela_Login;

import javax.swing.*;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    List<Administrador> administradores = new ArrayList<Administrador>();
    DadosAdministrador dadosAdministrador = new DadosAdministrador();
    DadosFuncionario dadosFuncionario = new DadosFuncionario();

    public boolean verificarLoginAdm(String emailLogin, String senhaLogin) throws ParseException {

        boolean validador = dadosAdministrador.validarLogin(emailLogin, senhaLogin);
        if (validador == true) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, digite novamente!");
        }

        return validador;
    }

    public boolean verificarLoginFuncionario(String emailLogin, String senhaLogin) {

        boolean validador = dadosFuncionario.validarLogin(emailLogin, senhaLogin);
        if (validador == true) {
            JOptionPane.showMessageDialog(null, "Olá, seja bem vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Email ou senha incorretos, digite novamente!");
        }
        return validador;
    }

    public void abrirTelaAdm() throws ParseException {
        Tela_Adm tela_adm = new Tela_Adm();
    }

    public void abrirTelaFuncionario(){

    }


}
