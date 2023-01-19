package model;
public class Contador extends Funcionario{

    public Contador(String email, String senha, String telefone, String nome, String cargo) {
        super(email, senha, telefone, nome, cargo);
    }

    public float calcularLucroLiquido(){

        return 0;
    }
}
