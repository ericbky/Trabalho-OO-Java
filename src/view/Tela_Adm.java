package view;

import controller.AdministradorController;
import controller.ClienteController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_Adm extends JFrame {

    private JButton sairButton;
    private JTextField menuDeOpçõesTextField;
    private JComboBox lista_clientes;
    private JButton escolherButton;
    private JButton cadastrarButton;
    private JPanel Tela_Adm;
ClienteController clienteController = new ClienteController();
    AdministradorController administradorController = new AdministradorController();

    public Tela_Adm() throws ParseException {

        setContentPane(Tela_Adm);
        setTitle("Administrador");
        setSize(550, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarCombox();

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    limparCombobox();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
                setContentPane(Tela_Adm);
                setVisible(false);
                administradorController.abrirTelaLogin();
            }
        });
        escolherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Pegando o cliente da JcomboBox
                String cliente;
                cliente = lista_clientes.getSelectedItem() + "";
                //Fechando a tela ADM, chamando a tela de exibir cliente e passando como parâmetro o cliente
                setContentPane(Tela_Adm);
                setVisible(false);
                try {
                    limparCombobox();
                    Tela_Cliente tela_cliente = new Tela_Cliente();
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
                    setContentPane(Tela_Adm);
                    setVisible(false);
                    Tela_ClienteCad clienteCad = new Tela_ClienteCad();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    public void chamarCombox() throws ParseException {

        String razaoClientes[] = new String[100];
        int tamanhoClientes;
        int cont;

        //Pegando as razões sociais do banco de dados
        razaoClientes = administradorController.exibirClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = administradorController.tamanhoClientes();

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
        razaoClientes = administradorController.exibirClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = administradorController.tamanhoClientes();

        //Listando
        for (cont = 0; cont < tamanhoClientes; cont++) {
            lista_clientes.removeItem(razaoClientes[cont]);
        }
    }
}