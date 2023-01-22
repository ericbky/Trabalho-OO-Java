package controller;
import model.*;
import view.*;

import java.text.ParseException;

public class ClienteController {

    public static void metodo1Cliente() throws ParseException {

        listarClientes(null, null, null, null, null, null);
    }

    public static void listarClientes(String email, String telefone, String cnpj,
                                      String razaoSocial, String inicioContrato, String fimContrato) throws ParseException {
        Cliente cliente = new Cliente(email, telefone, cnpj, razaoSocial, inicioContrato, fimContrato);
        cliente.mostrarClientes();
    }

}
