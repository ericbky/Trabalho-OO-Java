package controller;

import model.*;
import sistema.*;

import java.text.ParseException;

public class PedidoController {

    public String [] exibirDadosPedido(String pedido){
        return DadosPedido.exibirDadosPedido(pedido);
    }

    public String [] exibirPedidosCB() throws ParseException {
        return DadosPedido.comboPedidos();
    }
    public int tamanhoPedidos(){
        return DadosPedido.tamanhoPedidos();
    }

    public boolean excluirPedido(String pedidoEx){
        return DadosPedido.excluirPedido(pedidoEx);
    }

    public boolean cadastrarPedido (String [] dadosPedidoCad, int num){
        return DadosPedido.cadastrarPedido(dadosPedidoCad, num);
    }

    public boolean procurarCliente(String cnpjCliente){
        return DadosCliente.procurarCliente(cnpjCliente);
    }

}
