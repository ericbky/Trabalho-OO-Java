package model;

public class Pedido {

    private String numeroSerie;
    private String dataPedido;
    private String quantidadeRoupa;
    private String status;
    private String tipoLavagem;
    private String cnpjCliente;

    //CONSTRUTOR
    public Pedido(String numeroSerie, String dataPedido, String quantidadeRoupa, String status, String tipoLavagem, String cnpjCliente) {
        this.numeroSerie = numeroSerie;
        this.dataPedido = dataPedido;
        this.quantidadeRoupa = quantidadeRoupa;
        this.status = status;
        this.tipoLavagem = tipoLavagem;
        this.cnpjCliente = cnpjCliente;
    }

    //GETTERS AND SETTERS
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getQuantidadeRoupa() {
        return quantidadeRoupa;
    }

    public void setQuantidadeRoupa(String quantidadeRoupa) {
        this.quantidadeRoupa = quantidadeRoupa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoLavagem() {
        return tipoLavagem;
    }

    public void setTipoLavagem(String tipoLavagem) {
        this.tipoLavagem = tipoLavagem;
    }

    public String getcnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(Cliente cliente) {
        this.cnpjCliente = cnpjCliente;
    }
}

