package sistema;

import model.Cliente;
import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class DadosPedido {
    static List<Pedido> pedidos = new ArrayList<Pedido>();
    static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void DadosPreCadastradosPedidos(String numeroSerie, String dataPedido, int quantidadeRoupa, String status, String tipoLavagem, Cliente cliente) {
        //Cadastrando Pedidosdidos

        pedidos.add(new Pedido("0716940900174", "21/01/2023", 130,
                "Em processo", "Rápida", clientes.get(0)));
        pedidos.add(new Pedido("43338633", "30/12/2022", 253,
                "Concluído", "Pesada", clientes.get(1)));
        pedidos.add(new Pedido("105220434", "25/02/2023", 253,
                "Agendado", "Centrifugação", clientes.get(2)));


        for (Pedido pedido : pedidos) {
            System.out.println("-----------||-----------\n");
            System.out.printf("Número de série: %s\n", pedido.getNumeroSerie());
            System.out.printf("Data do pedido: %s\n\n", pedido.getDataPedido());

        }
}}
