package model;
public class Lavagem {

    private String potenciaLavagem;
    private Float quantidadeAgua;
    private String produtoLimpeza;

    public Lavagem(String potenciaLavagem, Float quantidadeAgua, String produtoLimpeza) {
        this.potenciaLavagem = potenciaLavagem;
        this.quantidadeAgua = quantidadeAgua;
        this.produtoLimpeza = produtoLimpeza;
    }

    public String getPotenciaLavagem() {
        return potenciaLavagem;
    }

    public void setPotenciaLavagem(String potenciaLavagem) {
        this.potenciaLavagem = potenciaLavagem;
    }

    public Float getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public void setQuantidadeAgua(Float quantidadeAgua) {
        this.quantidadeAgua = quantidadeAgua;
    }

    public String getProdutoLimpeza() {
        return produtoLimpeza;
    }

    public void setProdutoLimpeza(String produtoLimpeza) {
        this.produtoLimpeza = produtoLimpeza;
    }
}
