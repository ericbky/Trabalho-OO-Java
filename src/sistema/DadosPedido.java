package sistema;

import model.Cliente;
import model.Pedido;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DadosPedido {
    static List<Pedido> pedidos = new ArrayList<Pedido>();
    static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void DadosPreCadastradosPedidos(String numeroSerie, String dataPedido, Integer quantidadeRoupa, String status, String tipoLavagem, Cliente cliente) {
        //Cadastrando Pedidosdidos

        pedidos.add(new Pedido("0716940900174", "21/01/2023", 130,
                "Em processo", "Rápida", "71.901.376/0001-15"));
        pedidos.add(new Pedido("43338633", "30/12/2022", 253,
                "Concluído", "Pesada", "12.738.250/0001-02"));
        pedidos.add(new Pedido("105220434", "25/02/2023", 253,
                "Agendado", "Centrifugação", "725.874.758/0001-80"));

}
    public static int tamanhoPedidos() {
        return pedidos.size();
    }

    static public String[] comboPedidos() throws ParseException {

        String[] vPedidos = new String[100];
        int cont = 0;

        for (Pedido pedido : pedidos) {
            vPedidos[cont] = pedido.getNumeroSerie();
            cont++;
        }
        return vPedidos;
    }
}
