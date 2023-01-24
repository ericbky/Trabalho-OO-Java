package sistema;

import model.Cliente;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DadosCliente {

    static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void DadosPreCadastradosClientes(String email, String telefone, String cnpj, String razaoSocial, String inicioContrato, String fimContrato) throws ParseException {

        //Cadastrando Clientes
        clientes.add(new Cliente("email11111111@hotmail.com", "61989787987", "71.901.376/0001-15", "UnbGama", "18/01/2023", "12/12/2023"));
        clientes.add(new Cliente("email22222222@hotmail.com", "61912345658", "725.874.758/0001-80", "UnbDarcyRibeiro", "12/12/2022", "25/12/2022"));
        clientes.add(new Cliente("email33333333@hotmail.com", "61982572248", "12.738.250/0001-02", "UnbFCE", "21/01/2023", "25/01/2023"));

        /*for (Cliente cliente : clientes) {
            System.out.println("-----------||-----------\n");
            System.out.printf("Razão Social: %s\n", cliente.getRazaoSocial());
            System.out.printf("Email: %s\n", cliente.getEmail());
            System.out.printf("Telefone: %s\n", cliente.getTelefone());
            System.out.printf("Inicio do contrato: %s\n", cliente.getInicioContrato());
            System.out.printf("Fim do contrato: %s\n\n", cliente.getFimContrato());
        }*/
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
    public static void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    static public String[] exibirClientes() throws ParseException {


        String vClientes[] = new String[100];
        int cont = 0;

        DadosPreCadastradosClientes(null, null, null, null, null, null);

        for(Cliente cliente: clientes){
            vClientes[cont] = cliente.getRazaoSocial();
            cont++;
        }
        return vClientes;
    }

    public static int tamanhoClientes() {
        return clientes.size();
    }
}
