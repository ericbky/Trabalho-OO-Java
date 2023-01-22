package model;
import controller.*;

public class Usuario {
    private String email;
    private String senha;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //CONSTRUTOR
    public Usuario(String email, String senha, String telefone) {
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
    }
