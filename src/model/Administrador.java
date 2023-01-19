package model;
import java.util.*;

public class Administrador extends Usuario {

    public Administrador (String email, String senha, String telefone) {
        super(email, senha, telefone);
    }

    private String nome;
    private String cargo;

    public Administrador (String email, String senha, String telefone, String nome, String cargo) {
        super(email, senha, telefone);
        this.nome = nome;
        this.cargo = cargo;
    }
}
