package controller;

import view.*;
import sistema.DadosCliente;

import java.text.ParseException;

public class ClienteController {

    DadosCliente dadosCliente = new DadosCliente();
    PedidoController pedidoController = new PedidoController();

    public String[] exibirCliente(String cliente) throws ParseException {
        return DadosCliente.exibirClientes(cliente);
    }

    public void abrirTelaAdm() throws ParseException {
        Tela_ListarClientes tela_adm = new Tela_ListarClientes();
    }

    public boolean excluirCliente(String cliente, String cnpj) {
        boolean validador;
        validador = pedidoController.excluirPedidoCliente(cnpj) && dadosCliente.excluirCliente(cliente);
        return validador;
    }

    public boolean cadastrarCliente(String[] dadosClienteCad) throws ParseException {
        return DadosCliente.cadastrarCliente(dadosClienteCad);
    }

    public boolean editarCadastroCliente(String[] cliente) throws ParseException {
        return dadosCliente.editarDadosCliente(cliente);
    }

    public String[] exibirClientes() throws ParseException {
        return DadosCliente.comboClientes();
    }

    public String[] exibirCnpjClientes() throws ParseException {
        return DadosCliente.comboCnpjClientes();
    }

    public int tamanhoClientes() {
        return DadosCliente.tamanhoClientes();
    }

    public boolean exibirPedCliente(String cnpjCliente) {
        return true;
    }

}
