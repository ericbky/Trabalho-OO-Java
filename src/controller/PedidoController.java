package controller;

import model.*;
import sistema.*;

import java.text.ParseException;

public class PedidoController {

    DadosPedido dadosPedido = new DadosPedido();
    public static void metodo1Pedido() throws ParseException {
        chamar(null, null, 0, null, null, null);
    }

    public static void chamar(String numeroSerie, String dataPedido, Integer quantidadeRoupa, String status, String tipoLavagem, String cnpjCliente) throws ParseException {
        Pedido pedido = new Pedido(numeroSerie, dataPedido, quantidadeRoupa, status, tipoLavagem, cnpjCliente);

        //pedido.listarPedido();
    }

    public String [] exibirPedidos() throws ParseException {
        return dadosPedido.comboPedidos();
    }
    public int tamanhoPedidos(){
        return dadosPedido.tamanhoPedidos();
    }

}
