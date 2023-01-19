package model;
import java.util.*;

public class Motorista extends Funcionario{

    private String cnh;

    public Motorista(String email, String senha, String telefone, String nome, String cargo, String cnh, int opcaoUsuario) {
        super(email, senha, telefone, nome, cargo, opcaoUsuario);
        this.cnh = cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCnh(){
        return cnh;
    }
}
