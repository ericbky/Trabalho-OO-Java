package model;

import java.awt.*;
import java.text.ParseException;

public class Cliente {

    private final String email;
    private String telefone;
    private String cnpj;
    private String endereco;
    private String inicioContrato;
    private String razaoSocial;
    private String fimContrato;

    public String getEmail() {
        return email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente(String email, String telefone, String cnpj,
                   String razaoSocial,  String endereco, String inicioContrato, String fimContrato) throws ParseException {
        this.email = email;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }
}
