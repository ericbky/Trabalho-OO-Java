package controller;

import model.*;
import sistema.*;
import view.Tela_Login;

import java.text.ParseException;

public class AdministradorController {

    public void abrirTelaLogin() {
        Tela_Login tela_login = new Tela_Login();
    }

    public String[] buscarAdministrador1() {
        return DadosAdministrador.adm1();

    }

    public String[] buscarAdministrador2() {
        return DadosAdministrador.adm2();

    }

    public String[] buscarAdministrador3() {
        return DadosAdministrador.adm3();

    }

}
