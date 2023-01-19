package model;
import java.util.*;

public class Cliente extends Usuario {

    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private Date inicioContrato;
    private Date fimContrato;

    public Cliente(String email, String senha, String telefone, int opcaoUsuario) {
        super(email, senha, telefone, opcaoUsuario);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(Date fimContrato) {
        this.fimContrato = fimContrato;
    }

    public Cliente(String email, String senha, String telefone, int opcaoUsuario, String cnpj, String razaoSocial, String inscricaoEstadual, Date inicioContrato, Date fimContrato) {
        super(email, senha, telefone, opcaoUsuario);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    public void listarPedidos() {
        //Método de listagem
    }

}
