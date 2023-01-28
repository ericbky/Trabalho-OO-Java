package controller;

import sistema.DadosFuncionario;
import view.Tela_MenuFuncionario;

import java.text.ParseException;

public class FuncionarioController {

    DadosFuncionario dadosFuncionario = new DadosFuncionario();

    public String[] exibirFuncionariosCB() throws ParseException {
        return DadosFuncionario.comboFuncionarios();
    }

    public String [] exibirFuncionario(String funcionario) throws ParseException {

        return DadosFuncionario.exibirFuncionario(funcionario);
    }

    public boolean editarFuncionario(String [] funcionario){

        return dadosFuncionario.editarDadosFuncionario(funcionario);
    }

    public int tamanhoFuncionarios(){
        return DadosFuncionario.tamanhoFuncionarios();
    }

    public boolean excluirFuncionario(String funcionario){
        return dadosFuncionario.excluirFuncionario(funcionario);
    }

    public boolean cadastrarFuncionario(String [] dadosFuncionario){
        return  DadosFuncionario.cadastrarFuncionario(dadosFuncionario);
    }

    public void abrirTelaMenuFuncionario(){
        Tela_MenuFuncionario tela_menuFuncionario = new Tela_MenuFuncionario();
    }

}
