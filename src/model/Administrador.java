package model;
import java.util.*;

public class Administrador extends Usuario {

    public Administrador (String email, String senha, String telefone, int opcaoUsuario) {
        super(email, senha, telefone, opcaoUsuario);
    }

    private String nome;
    private String cargo;

    public Administrador (String email, String senha, String telefone, String nome, String cargo, int opcaoUsuario) {
        super(email, senha, telefone, opcaoUsuario);
        this.nome = nome;
        this.cargo = cargo;
    }
}
