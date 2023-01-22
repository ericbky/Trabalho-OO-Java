package controller;

import model.*;

import java.text.ParseException;

public class PedidoController {

    public static void metodo1Pedido() throws ParseException {
        chamar(null, null, 0, null, null, null);
    }

    public static void chamar(String numeroSerie, String dataPedido, Integer quantidadeRoupa, String status, String tipoLavagem, Cliente cliente) throws ParseException {
        Pedido pedido = new Pedido(numeroSerie, dataPedido, quantidadeRoupa, status, tipoLavagem, cliente);

        pedido.listarPedido();
    }
}
