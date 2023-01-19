package model;
import java.util.*;

public class Pagamento {
    private float valorTotal = 0;

    public Pagamento(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
