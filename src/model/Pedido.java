package model;

import sistema.*;

import java.text.ParseException;

public class Pedido {

    private String numeroSerie;
    private String dataPedido;
    private int quantidadeRoupa;
    private String status;
    private String tipoLavagem;
    private Cliente cliente;

    //CONSTRUTOR


    public Pedido() {
    }

    public Pedido(String numeroSerie, String dataPedido, int quantidadeRoupa, String status, String tipoLavagem, Cliente cliente) {
        this.numeroSerie = numeroSerie;
        this.dataPedido = dataPedido;
        this.quantidadeRoupa = quantidadeRoupa;
        this.status = status;
        this.tipoLavagem = tipoLavagem;
        this.cliente = cliente;
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

    public int getQuantidadeRoupa() {
        return quantidadeRoupa;
    }

    public void setQuantidadeRoupa(int quantidadeRoupa) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //MÉTODOS
    public float calcularSomaRoupa() {
        float soma = 0;
        return soma;
    }
    public void listarTipos() {

    }
    public float calcularPrecoFinal() {
        float soma = 0;
        return soma;
    }
}

