package model;
public class Contador extends Funcionario{

    public Contador(String email, String senha, String telefone, String nome, String cargo, int opcaoUsuario) {
        super(email, senha, telefone, nome, cargo, opcaoUsuario);
    }

    public float calcularLucroLiquido(){

        return 0;
    }
}
