package controller;

import sistema.*;

import java.text.ParseException;

public class PedidoController {

    static DadosPedido dadosPedido = new DadosPedido();

    public String[] exibirDadosPedido(String pedido) {
        return DadosPedido.exibirDadosPedido(pedido);
    }

    public String[] exibirPedidosCB() throws ParseException {
        return DadosPedido.comboPedidos();
    }

    public int tamanhoPedidos() {
        return DadosPedido.tamanhoPedidos();
    }

    public boolean excluirPedido(String pedidoEx) {
        return DadosPedido.excluirPedido(pedidoEx);
    }

    public boolean cadastrarPedido(String[] dadosPedidoCad) {
        return DadosPedido.cadastrarPedido(dadosPedidoCad);
    }

    public static boolean editarPedido(String[] dPedido) {
        return dadosPedido.editarDadosPedido(dPedido);
    }

    public String[] exibirPedCliente(String cnpjCliente) {

        return dadosPedido.exibirPedCliente(cnpjCliente);
    }

    public int tamanhoPedidoCliente(String cnpjCliente) {
        return DadosPedido.tamanhoPedidoCliente(cnpjCliente);
    }

    public boolean excluirPedidoCliente(String cnpjCliente) {
        return DadosPedido.excluirPedidoCliente(cnpjCliente);
    }

}
