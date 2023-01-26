package controller;

import model.*;
import sistema.*;
import view.Tela_Login;

import java.text.ParseException;

public class AdministradorController {

    DadosCliente dadosCliente = new DadosCliente();

    public String [] exibirClientes() throws ParseException {
        return dadosCliente.comboClientes();
    }
    public int tamanhoClientes(){
        return dadosCliente.tamanhoClientes();
    }

    public void abrirTelaLogin(){
        Tela_Login tela_login = new Tela_Login();
    }

    }
