package controller;

import sistema.DadosAdministrador;
import sistema.DadosCliente;
import sistema.DadosFuncionario;
import sistema.DadosPedido;
import view.Tela_ListarClientes;
import view.Tela_MenuAdm;
import view.Tela_MenuFuncionario;

import javax.swing.*;
import java.text.ParseException;

public class LoginController {
    DadosAdministrador dadosAdministrador = new DadosAdministrador();
    DadosFuncionario dadosFuncionario = new DadosFuncionario();

    DadosPedido dadosPedido = new DadosPedido();

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
        Tela_MenuAdm tela_adm = new Tela_MenuAdm();
    }

    public void abrirTelaFuncionario(){
        Tela_MenuFuncionario tela_funcionario = new Tela_MenuFuncionario();
    }
    public void iniciarBancoClientes() throws ParseException {

        DadosCliente.DadosPreCadastradosClientes(null, null, null, null, null, null);
    }
    public void iniciarBancoAdministradores(){
        DadosAdministrador.DadosPreCadastradosAdministrador(null, null, null, null);
    }
    public void iniciarBancoFuncionarios(){

        DadosFuncionario.DadosPreCadastradosFuncionarios(null,null,null,null,null);
    }
    public void iniciarBancoPedidos(){
        DadosPedido.DadosPreCadastradosPedidos(null,null,null,null,null,null);
    }
}
