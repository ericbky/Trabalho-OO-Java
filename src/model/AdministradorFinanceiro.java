package model;
import java.util.*;

public class AdministradorFinanceiro extends Funcionario{

    public AdministradorFinanceiro(String email, String senha, String telefone, String nome, String cargo) {
        super(email, senha, telefone, nome, cargo);
    }

    public void gerarOrdemCompra(){

    }
    public void pagarConta(){
    }
}
