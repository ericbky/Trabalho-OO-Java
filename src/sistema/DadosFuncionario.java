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

    static public String[] comboFuncionarios() throws ParseException {
        String[] vFuncionarios = new String[100];
        int cont = 0;

        for (Funcionario funcionario : funcionarios) {
            vFuncionarios[cont] = funcionario.getNome();
            cont++;
        }
        return vFuncionarios;
    }

    public static int tamanhoFuncionarios() {
        return funcionarios.size();
    }

    static public String[] exibirFuncionario(String funcionarioCombo) throws ParseException {

        String[] vFuncionario = new String[100];
        String nomeFunc;
        //Salvando os dados para retornar na view de clientes
        for (Funcionario funcionario : funcionarios) {
            nomeFunc = funcionario.getNome();
            if (funcionarioCombo.equals(nomeFunc)) {
                vFuncionario[0] = funcionario.getEmail();
                vFuncionario[1] = funcionario.getSenha();
                vFuncionario[2] = funcionario.getTelefone();
                vFuncionario[3] = funcionario.getNome();
                vFuncionario[4] = funcionario.getCargo();
            }
        }
        return vFuncionario;
    }
}