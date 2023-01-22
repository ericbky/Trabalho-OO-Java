package Sistema;

import model.*;

import java.text.ParseException;
import java.util.ArrayList;

public class BancoDados {

    static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    //public static Funcionario[] ImprimirFuncionários(Funcionario funcionario) {}

    public static void DadosPreCadastradosFuncionarios() {


        //Cadastrando Funcionários

        funcionarios.add(new Funcionario("silveirames@hotmail.com", "P@ssword123",
                "61999999999", "Eric Silveira Gomes", "CEO"));

        funcionarios.add(new Funcionario("metraton727@gmail.com", "QualquerUmaParaTeste",
                "61977777777", "Luiz Gustavo", "CEO"));

        funcionarios.add(new Funcionario("silveirames@hotmail.com", "P@ssword123",
                "61999999999", "Vitor Feijó", "CEO"));

        funcionarios.add(new Funcionario("arthurrrrrrrrr@gmail.com", "TesteTeste",
                "61966666666", "Arthur Teste", "CEO"));


        for (Funcionario funcionario : funcionarios) {
            System.out.println("----------||----------\n");
            System.out.printf("Nome: %s\n", funcionario.getNome());
            System.out.printf("Email: %s\n", funcionario.getEmail());
            System.out.printf("Telefone: %s\n\n", funcionario.getTelefone());

        }
    }

    public static void DadosPreCadastradosClientes() throws ParseException {

        //Cadastrando Clientes
            clientes.add(new Cliente("email11111111@hotmail.com", "61989787987",
                    "71.901.376/0001-15", "UnbGama", "18/01/2023", "12/12/2023"));
            clientes.add(new Cliente("email22222222@hotmail.com", "61912345658"
                  , "725.874.758/0001-80", "UnbDarcyRibeiro",  "12/12/2022", "25/12/2022"));
            clientes.add(new Cliente("email33333333@hotmail.com", "61982572248",
                    "12.738.250/0001-02", "UnbFCE",  "21/01/2023", "25/01/2023"));

        for (Cliente cliente : clientes) {
            System.out.println("-----------||-----------\n");
            System.out.printf("Razão Social: %s\n", cliente.getRazaoSocial());
            System.out.printf("Email: %s\n", cliente.getEmail());
            System.out.printf("Telefone: %s\n", cliente.getTelefone());
            System.out.printf("Inicio do contrato: %s\n", cliente.getInicioContrato());
            System.out.printf("Fim do contrato: %s\n\n", cliente.getFimContrato());
        }

    }

    public static void DadosPreCadastradosPedidos() {
        //Cadastrando Pedidos

        pedidos.add(new Pedido("0716940900174", "21/01/2023", 130,
                "Em processo", "Rápida", clientes.get(0)));
        pedidos.add(new Pedido("43338633", "30/12/2022", 253,
                "Concluído", "Pesada", clientes.get(1)));
        pedidos.add(new Pedido("105220434", "25/02/2023", 253,
                "Agendado", "Centrifugação", clientes.get(2)));

        for (Pedido pedido : pedidos) {
            System.out.println("-----------||-----------\n");
            System.out.printf("Número de série: %s\n", pedido.getNumeroSerie());
            System.out.printf("Data do pedido: %s\n\n", pedido.getDataPedido());

        }
    }
}

