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

        pedidos.add(new Pedido("071694090", "21/01/2023", "30",
                "Em processo", "Rápida", "71.901.376/0001-15"));
        pedidos.add(new Pedido("233386335", "30/12/2022", "253",
                "Concluído", "Pesada", "12.738.250/0001-02"));
        pedidos.add(new Pedido("105220434", "25/02/2023", "95",
                "Agendado", "Rápida", "725.874.758/0001-80"));
        pedidos.add(new Pedido("105234432", "31/12/2022", "132",
                "Agendado", "Pesada", "725.874.758/0001-80"));
        pedidos.add(new Pedido("445234432", "31/12/2022", "21",
                "Agendado", "Centrifugação", "71.901.376/0001-15"));
        pedidos.add(new Pedido("587246565", "18/11/2022", "122",
                "Agendado", "Centrifugação", "725.874.758/0001-80"));
        pedidos.add(new Pedido("917984652", "18/11/2022", "135",
                "Agendado", "Centrifugação", "12.738.250/0001-02"));

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

    public static String[] exibirDadosPedido(String numPedido) {

        String[] vPedidos = new String[100];
        String numSerie;
        //Salvando os dados para retornar na view de clientes
        for (Pedido pedido : pedidos) {
            numSerie = pedido.getNumeroSerie();
            if (numPedido.equals(numSerie)) {
                vPedidos[0] = pedido.getNumeroSerie();
                vPedidos[1] = pedido.getDataPedido();
                vPedidos[2] = String.valueOf(pedido.getQuantidadeRoupa());
                vPedidos[3] = pedido.getStatus();
                vPedidos[4] = pedido.getTipoLavagem();
                vPedidos[5] = pedido.getcnpjCliente();
            }
        }
        return vPedidos;
    }

    public static boolean excluirPedido(String pedidoEx) {
        int cont = 0, num = 0;
        boolean validarExclusao = false;
        for (Pedido pedido : pedidos) {
            if (pedidoEx.equals(pedido.getNumeroSerie())) {
                num = cont;
                validarExclusao = true;
            }
            cont++;
        }
        if (validarExclusao) {
            return exclusaoPedido(num);
        } else {
            return false;
        }
    }

    public static boolean excluirPedidoCliente(String dadoCliente) {
        int[] pedidosEx = new int[100];
        int cont = 0, cont2 = 0;
        boolean validarExclusao = false;

        for (Pedido pedido : pedidos) {
            if (dadoCliente.equalsIgnoreCase(pedido.getcnpjCliente())) {
                pedidosEx[cont2] = cont;
                cont2++;
                validarExclusao = true;
            }
            cont++;
        }
        exclusaoPedidoCliente(pedidosEx, cont2);
        return validarExclusao;
    }

    private static void exclusaoPedidoCliente(int[] numEx, int contador) {
        int cont = 0;
        for (cont = 0; cont < contador; cont++) {
            pedidos.remove(numEx[cont]);
        }
    }

    private static boolean exclusaoPedido(int num) {
        pedidos.remove(num);
        return true;
    }

    public static boolean cadastrarPedido(String[] cadastrarPedido) {

        pedidos.add(new Pedido(cadastrarPedido[0] + "", cadastrarPedido[1] + "", cadastrarPedido[2] + "",
                cadastrarPedido[3] + "", cadastrarPedido[4] + "", cadastrarPedido[5]));
        return true;
    }

    public boolean editarDadosPedido(String[] dadosPedido) {
        int cont = 0, num = 0;
        boolean validarExclusao = false;
        //Buncando os clientes na lista, removendo e adicionando os novos dados
        for (Pedido pedido : pedidos) {
            if (dadosPedido[0].equals(pedido.getNumeroSerie())) {
                num = cont;
                validarExclusao = true;
            }
            cont++;
        }

        //excluindo o pedido antigo
        pedidos.remove(num);

        //adicionando os novos dados do pedido
        pedidos.add(new Pedido(dadosPedido[0] + "", dadosPedido[1] + "",
                dadosPedido[2] + "", dadosPedido[3] + "", dadosPedido[4] + "", dadosPedido[5] + ""));

        return validarExclusao;
    }

    public String[] exibirPedCliente(String cnpjCliente) {

        String[] vPedidos = new String[100];
        int cont = 0;

        for (Pedido pedido : pedidos) {
            if (cnpjCliente.equalsIgnoreCase(pedido.getcnpjCliente())) {
                vPedidos[cont] = pedido.getNumeroSerie();
                cont++;
            }
        }
        return vPedidos;
    }

    public static int tamanhoPedidoCliente(String cnpjCliente) {

        int cont = 0;

        for (Pedido pedido : pedidos) {
            if (cnpjCliente.equalsIgnoreCase(pedido.getcnpjCliente())) {
                cont++;
            }
        }
        return cont;

    }
}
