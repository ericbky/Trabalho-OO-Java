package model;
import java.util.*;

public class Item {
    private String tipoRoupa;
    private String precoTipoRoupa;
    private Pedido pedido;

    public Item(String tipoRoupa, String precoTipoRoupa, Pedido pedido) {
        this.tipoRoupa = tipoRoupa;
        this.precoTipoRoupa = precoTipoRoupa;
        this.pedido = pedido;
    }

    public String getTipoRoupa() {
        return tipoRoupa;
    }

    public void setTipoRoupa(String tipoRoupa) {
        this.tipoRoupa = tipoRoupa;
    }

    public String getPrecoTipoRoupa() {
        return precoTipoRoupa;
    }

    public void setPrecoTipoRoupa(String precoTipoRoupa) {
        this.precoTipoRoupa = precoTipoRoupa;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}

