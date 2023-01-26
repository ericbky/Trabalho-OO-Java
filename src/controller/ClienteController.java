package controller;

import view.*;
import sistema.DadosCliente;

import java.text.ParseException;

public class ClienteController {

    DadosCliente dadosCliente = new DadosCliente();

    public String[] exibirCliente(String cliente) throws ParseException {
        return DadosCliente.exibirClientes(cliente);
    }

    public void abrirTelaAdm() throws ParseException {
        Tela_ListarClientes tela_adm = new Tela_ListarClientes();
    }

    public boolean excluirCliente(String cliente) {
        return dadosCliente.excluirCliente(cliente);
    }

    public boolean cadastrarCliente(String[] dadosClienteCad) throws ParseException {
        return DadosCliente.cadastrarCliente(dadosClienteCad);
    }

    public boolean editarCadastroCliente(String[] cliente) throws ParseException {
        return dadosCliente.editarDadosCliente(cliente);
    }
}
