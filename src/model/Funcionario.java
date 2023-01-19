package model;
import java.util.*;

public class Funcionario extends Usuario {

    public Funcionario (String email, String senha, String telefone) {
        super(email, senha, telefone);
    }

    private String nome;
    private String cargo;

    public Funcionario (String email, String senha, String telefone, String nome, String cargo) {
        super(email, senha, telefone);
        this.nome = nome;
        this.cargo = cargo;
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

    public void listarPedidos() {
        //Método de listagem
    }

}
