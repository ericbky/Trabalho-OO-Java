package model;
import java.util.*;

public class RolEntrada extends Pedido{

    private String dataLavagem;

    public RolEntrada(String numeroSerie, String dataPedido, String quantidadeRoupa, String status, String tipoLavagem, String cnpjCliente) {
        super(numeroSerie, dataPedido, quantidadeRoupa, status, tipoLavagem, cnpjCliente);
    }

    public String getDataLavagem() {
        return dataLavagem;
    }

    public void setDataLavagem(String dataLavagem) {
        this.dataLavagem = dataLavagem;
    }
}
