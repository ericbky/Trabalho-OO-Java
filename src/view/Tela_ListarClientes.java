package view;

import controller.AdministradorController;
import controller.ClienteController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_ListarClientes extends JFrame {

    private JButton sairButton;
    private JTextField menuDeOpçõesTextField;
    private JComboBox lista_clientes;
    private JButton escolherButton;
    private JButton cadastrarButton;
    private JPanel tela_ListarClientes;
ClienteController clienteController = new ClienteController();
    AdministradorController administradorController = new AdministradorController();

    public Tela_ListarClientes() throws ParseException {

        setContentPane(tela_ListarClientes);
        setTitle("Listar Clientes");
        setSize(550, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarComboBox();

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    limparCombobox();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                setContentPane(tela_ListarClientes);
                setVisible(false);
                Tela_MenuAdm tela_adm = new Tela_MenuAdm();
            }
        });
        escolherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Pegando o cliente da JcomboBox
                String cliente;
                cliente = lista_clientes.getSelectedItem() + "";
                //Fechando a tela ADM, chamando a tela de exibir cliente e passando como parâmetro o cliente
                setContentPane(tela_ListarClientes);
                setVisible(false);
                try {
                    limparCombobox();
                    Tela_exibirCliente tela_cliente = new Tela_exibirCliente();
                    tela_cliente.exibirCliente(cliente);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //Chamando a tela cadastro de clientes e fechando a tela de Administrador
                try {
                    limparCombobox();
                    setContentPane(tela_ListarClientes);
                    setVisible(false);
                    Tela_ClienteCad clienteCad = new Tela_ClienteCad();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    public void chamarComboBox() throws ParseException {

        String razaoClientes[] = new String[100];
        int tamanhoClientes;
        int cont;

        //Pegando as razões sociais do banco de dados
        razaoClientes = clienteController.exibirClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = clienteController.tamanhoClientes();

        //Listando
        for (cont = 0; cont < tamanhoClientes; cont++) {
            lista_clientes.addItem(razaoClientes[cont]);
        }
    }

    public void limparCombobox() throws ParseException {

        String razaoClientes[] = new String[100];
        int tamanhoClientes;
        int cont;

        //Pegando as razões sociais do banco de dados
        razaoClientes = clienteController.exibirClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = clienteController.tamanhoClientes();

        //Listando
        for (cont = 0; cont < tamanhoClientes; cont++) {
            lista_clientes.removeItem(razaoClientes[cont]);
        }
    }
}