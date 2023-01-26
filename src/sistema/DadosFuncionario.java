package sistema;

import model.Administrador;
import model.Cliente;
import model.Funcionario;
import model.Pedido;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DadosFuncionario {
    static List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public static void DadosPreCadastradosFuncionarios(String email, String senha, String telefone, String nome, String cargo) {

        //Cadastrando Funcionários

        funcionarios.add(new Funcionario("func", "func", "61999999999", "FUNCIONÁRIO Eric", "CEO"));

        funcionarios.add(new Funcionario("func1", "func1", "61977777777", "FUNCIONÁRIO Luiz", "CEO"));

        funcionarios.add(new Funcionario("func123", "func123", "61999999999", "FUNCIONÁRIO Vitor", "CEO"));

        funcionarios.add(new Funcionario("functeste", "functeste", "61966666666", "FUNCIONÁRIO Arthur ", "CEO"));

    }

    public boolean validarLogin(String email, String senha) {
        boolean validador = false;
        DadosFuncionario dadosFuncionario = new DadosFuncionario();

        for (Funcionario funcionario : funcionarios) {
            if (email.equalsIgnoreCase(funcionario.getEmail()) && senha.equalsIgnoreCase(funcionario.getSenha())) {
                validador = true;
                //System.out.println("\nEMAIL BANCO DE DADOS: "+funcionario.getEmail()+"\nSENHA: "+funcionario.getSenha());
            }
        }
        return validador;
    }

    static public boolean pesquisarAdministrador(String nome) {
        boolean validador = false;

        for (Funcionario funcionarios : funcionarios) {
            if (nome.equalsIgnoreCase(funcionarios.getNome())) {
                validador = true;
            }
        }
        return validador;
    }
}