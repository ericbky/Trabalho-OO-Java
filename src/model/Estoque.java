package model;

public class Estoque {

    private int detergenteRoupa;
    private int detergenteAlcalino;
    private int alvejante;
    private int neutralizante;
    private int amaciante;
    private int embalagem;
    private int durex;
    private int lenha;

    public Estoque(int detergenteRoupa, int detergenteAlcalino, int alvejante, int neutralizante, int amaciante, int embalagem, int durex, int lenha) {
        this.detergenteRoupa = detergenteRoupa;
        this.detergenteAlcalino = detergenteAlcalino;
        this.alvejante = alvejante;
        this.neutralizante = neutralizante;
        this.amaciante = amaciante;
        this.embalagem = embalagem;
        this.durex = durex;
        this.lenha = lenha;
    }

    public int getDetergenteRoupa() {
        return detergenteRoupa;
    }

    public void setDetergenteRoupa(int detergenteRoupa) {
        this.detergenteRoupa = detergenteRoupa;
    }

    public int getDetergenteAlcalino() {
        return detergenteAlcalino;
    }

    public void setDetergenteAlcalino(int detergenteAlcalino) {
        this.detergenteAlcalino = detergenteAlcalino;
    }

    public int getAlvejante() {
        return alvejante;
    }

    public void setAlvejante(int alvejante) {
        this.alvejante = alvejante;
    }

    public int getNeutralizante() {
        return neutralizante;
    }

    public void setNeutralizante(int neutralizante) {
        this.neutralizante = neutralizante;
    }

    public int getAmaciante() {
        return amaciante;
    }

    public void setAmaciante(int amaciante) {
        this.amaciante = amaciante;
    }

    public int getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(int embalagem) {
        this.embalagem = embalagem;
    }

    public int getDurex() {
        return durex;
    }

    public void setDurex(int durex) {
        this.durex = durex;
    }

    public int getLenha() {
        return lenha;
    }

    public void setLenha(int lenha) {
        this.lenha = lenha;
    }
}
