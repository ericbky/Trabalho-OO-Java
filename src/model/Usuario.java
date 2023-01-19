package model;

public class Usuario {
    private String email;
    private String senha;
    private String telefone;

    private int opcaoUsuario;

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

    public int getopcaoUsuario() {
        return opcaoUsuario;
    }

    public void setOpcaoUsuario(int opcaoUsuario) {
        this.opcaoUsuario = opcaoUsuario;
    }

    //CONSTRUTOR
    public Usuario(String email, String senha, String telefone, int opcaoUsuario) {
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.opcaoUsuario = opcaoUsuario;
    }

    public void dadosUsuario(String email, String senha, String telefone, int opcaoUsuario){

    }

}
