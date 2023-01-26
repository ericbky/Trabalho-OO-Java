package controller;

import model.*;
import sistema.DadosFuncionario;
import view.Tela_MenuFuncionario;

import java.text.ParseException;
import java.util.*;

public class FuncionarioController {

    public String[] exibirFuncionariosCB() throws ParseException {
        return DadosFuncionario.comboFuncionarios();
    }

    public String [] exibirFuncionario(String funcionario) throws ParseException {

        return DadosFuncionario.exibirFuncionario(funcionario);
    }

    public int tamanhoFuncionarios(){
        return DadosFuncionario.tamanhoFuncionarios();
    }

    public static void cadastrarPedido() {
    }

    public void abrirTelaMenuFuncionario(){
        Tela_MenuFuncionario tela_menuFuncionario = new Tela_MenuFuncionario();
    }

    public static void editarPedido() {

    }

    public static void listarPedido() {

    }

    public static void excluirPedido() {

    }
}
