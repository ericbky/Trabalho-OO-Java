package controller;

import view.*;

public class ClienteController {

    private final Tela_Cliente view;

    public ClienteController(Tela_Cliente view) {
        this.view = view;
    }

    public void mostrarCliente(){
        this.view.exibirClientes("Teste aqui");
    }


}
