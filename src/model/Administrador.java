package model;
import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;

public class Administrador extends Usuario {
    private String nome;

    public Administrador(String email, String senha, String telefone) {
        super(email, senha, telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Administrador(String email, String senha, String telefone, String nome) {
        super(email, senha, telefone);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Administrador{}";
    }
}
