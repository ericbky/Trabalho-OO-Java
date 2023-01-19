package model;
import java.util.*;

public class RolEntrada extends Pedido{

    private Date dataLavagem;

    public RolEntrada(String numeroSerie, Date dataPedido, String nomeCliente, int quantidadeRoupa, String status, String tipoLavagem, Cliente cliente, Date dataLavagem) {
        super(numeroSerie, dataPedido, nomeCliente, quantidadeRoupa, status, tipoLavagem, cliente);
        this.dataLavagem = dataLavagem;
    }

    public Date getDataLavagem() {
        return dataLavagem;
    }

    public void setDataLavagem(Date dataLavagem) {
        this.dataLavagem = dataLavagem;
    }
}
