package model;
import java.util.*;

public class RolEntrada extends Pedido{

    private String dataLavagem;

    public RolEntrada(String numeroSerie, String dataPedido, int quantidadeRoupa, String status, String tipoLavagem, Cliente cliente) {
        super(numeroSerie, dataPedido, quantidadeRoupa, status, tipoLavagem, cliente);
    }

    public String getDataLavagem() {
        return dataLavagem;
    }

    public void setDataLavagem(String dataLavagem) {
        this.dataLavagem = dataLavagem;
    }
}
