package sistema;

import model.Cliente;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DadosCliente {

    static List<Cliente> clientes = new ArrayList<Cliente>();

    public static void DadosPreCadastradosClientes(String email, String telefone, String cnpj, String razaoSocial, String inicioContrato, String fimContrato) throws ParseException {

        //Cadastrando Clientes
        clientes.add(new Cliente("email11111111@hotmail.com", "61989787987", "71.901.376/0001-15", "UnbGama", "Projeção A - Gama Leste, Brasília - DF", "18/01/2023", "12/12/2023"));
        clientes.add(new Cliente("email22222222@hotmail.com", "61912345658", "725.874.758/0001-80", "UnbDarcyRibeiro", "UnB - Brasília, DF, 70910-900", "12/12/2022", "25/12/2022"));
        clientes.add(new Cliente("email33333333@hotmail.com", "61982572248", "12.738.250/0001-02", "UnbFCE", "S/n, Centro Metropolitano, Brasília - DF", "21/01/2023", "25/01/2023"));

    }

    public static boolean cadastrarCliente(String[] cadastrarCliente) throws ParseException {
        clientes.add(new Cliente(cadastrarCliente[0] + "", cadastrarCliente[1] + "",
                cadastrarCliente[2] + "", cadastrarCliente[3] + "", cadastrarCliente[4] + "",
                cadastrarCliente[5] + "", cadastrarCliente[6] + ""));
        return true;
    }

    static public String[] comboClientes() throws ParseException {
        String[] vClientes = new String[100];
        int cont = 0;

        for (Cliente cliente : clientes) {
            vClientes[cont] = cliente.getRazaoSocial();
            cont++;
        }
        return vClientes;
    }

    static public String[] comboCnpjClientes() throws ParseException {
        String[] vClientes = new String[100];
        int cont = 0;

        for (Cliente cliente : clientes) {
            vClientes[cont] = cliente.getCnpj();
            cont++;
        }
        return vClientes;
    }

    public static int tamanhoClientes() {
        return clientes.size();
    }

    static public String[] exibirClientes(String clienteCombo) throws ParseException {

        String[] vClientes = new String[100];
        String razaoSocial;
        //Salvando os dados para retornar na view de clientes
        for (Cliente cliente : clientes) {
            razaoSocial = cliente.getRazaoSocial();
            if (clienteCombo.equals(razaoSocial)) {
                vClientes[0] = cliente.getCnpj();
                vClientes[1] = cliente.getEmail();
                vClientes[2] = cliente.getTelefone();
                vClientes[3] = cliente.getEndereco();
                vClientes[4] = cliente.getRazaoSocial();
                vClientes[5] = cliente.getInicioContrato();
                vClientes[6] = cliente.getFimContrato();
            }
        }
        return vClientes;
    }

    public boolean excluirCliente(String clienteExcluir) {
        int cont = 0, num = 0;
        boolean validarExclusao = false;
        for (Cliente cliente : clientes) {
            if (clienteExcluir.equals(cliente.getRazaoSocial())) {
                num = cont;
                validarExclusao = true;
            }
            cont++;
        }
        if (validarExclusao) {
            return exclusaoCliente(num);
        } else {
            return false;
        }
    }

    private boolean exclusaoCliente(int num) {
        clientes.remove(num);
        return true;
    }

    public boolean editarDadosCliente(String[] dadosCliente) throws ParseException {
        int cont = 0, num = 0;
        boolean validarExclusao = false;
        //Buncando os clientes na lista, removendo e adicionando os novos dados
        for (Cliente cliente : clientes) {
            if (dadosCliente[0].equals(cliente.getCnpj())) {
                num = cont;
            }
            cont++;
        }

        //excluindo cliente, alterando os dados
        clientes.remove(num);

        //adicionondo os novos dados
        clientes.add(new Cliente(dadosCliente[1] + "", dadosCliente[2] + "",
                dadosCliente[0] + "", dadosCliente[4] + "", dadosCliente[3] + "",
                dadosCliente[5] + "", dadosCliente[6] + ""));
        return true;
    }

    public static boolean procurarCliente(String cnpjCliente) {
        boolean validador = false;

        for (Cliente cliente : clientes) {
            if (cnpjCliente.equalsIgnoreCase(cliente.getCnpj())) {
                validador = true;
            }
        }
        return validador;
    }
}