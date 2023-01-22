package model;

public class Administrador extends Usuario {
    private String nome;
    private String cargo;

    public Administrador(String email, String senha, String telefone) {
        super(email, senha, telefone);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrador (String email, String senha, String telefone, String nome, String cargo, int opcaoUsuario) {
        super(email, senha, telefone);
        this.nome = nome;
        this.cargo = cargo;
    }
}
