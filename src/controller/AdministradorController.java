package controller;

import model.Cliente;
import sistema.BancoDados;

import java.util.ArrayList;
import java.util.List;

public class AdministradorController {

    static List<Cliente> clientes = new ArrayList<Cliente>();

    public static boolean cadastrarCliente(Cliente cliente){

        try {
            clientes.add(cliente);
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public static void editarCliente(){

    }
    public static void excluirCliente(){

    }
}
