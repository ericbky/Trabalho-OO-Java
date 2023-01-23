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

        funcionarios.add(new Funcionario("silveirames@hotmail.com", "P@ssword123", "61999999999", "Eric Silveira Gomes", "CEO"));

        funcionarios.add(new Funcionario("metraton727@gmail.com", "QualquerUmaParaTeste", "61977777777", "Luiz Gustavo", "CEO"));

        funcionarios.add(new Funcionario("silveiraes@hotmail.com", "P@ssword123", "61999999999", "Vitor Feijó", "CEO"));

        funcionarios.add(new Funcionario("arthurrrrrrrrr@gmail.com", "TesteTeste", "61966666666", "Arthur Teste", "CEO"));


        for (Funcionario funcionario : funcionarios) {
            System.out.println("----------||----------\n");
            System.out.printf("Nome: %s\n", funcionario.getNome());
            System.out.printf("Email: %s\n", funcionario.getEmail());
            System.out.printf("Telefone: %s\n\n", funcionario.getTelefone());

        }
    }
}