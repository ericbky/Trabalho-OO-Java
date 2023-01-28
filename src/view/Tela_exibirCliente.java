package view;

import controller.ClienteController;
import controller.PedidoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_exibirCliente extends JFrame {
    private JTextField text_cnpj;
    private JTextField text_email;
    private JTextField text_telefone;
    private JTextField text_inicio_contrato;
    private JTextField text_fim_contrato;
    private JComboBox listaPedidos;
    private JPanel Tela_Cliente;
    private JTextField text_razao_social;
    private JButton editarClienteButton;
    private JButton voltarButton;
    private JTextField text_endereco;
    private JButton excluirCliente;

    ClienteController clienteController = new ClienteController();

    public Tela_exibirCliente() {
        setContentPane(Tela_Cliente);
        setTitle("Cliente");
        setSize(700, 685);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void exibirCliente(String cliente) throws ParseException {

        String[] vCliente;
        vCliente = clienteController.exibirCliente(cliente);

        text_cnpj.setText(vCliente[0]);
        text_email.setText(vCliente[1]);
        text_telefone.setText(vCliente[2]);
        text_endereco.setText(vCliente[3]);
        text_razao_social.setText(vCliente[4]);
        text_inicio_contrato.setText(vCliente[5]);
        text_fim_contrato.setText(vCliente[6]);

        voltarButton.addActionListener(e -> {
            setContentPane(Tela_Cliente);
            setVisible(false);
            try {
                clienteController.abrirTelaAdm();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        editarClienteButton.addActionListener(e -> {
            setContentPane(Tela_Cliente);
            setVisible(false);
            Tela_ClienteEdit tela_clienteEdit = new Tela_ClienteEdit();
            try {
                tela_clienteEdit.exibirClienteEdicao(cliente);
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        excluirCliente.addActionListener(e -> {
            try {
                excluirClientes(cliente, text_cnpj.getText());
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });

        chamarComboPed(vCliente[0]);

    }

    public void chamarComboPed(String cnpjCliente) {
        String[] vPedidos = new String[100];
        int tamanhoPedidos, cont;

        PedidoController pedidoController = new PedidoController();

        vPedidos = pedidoController.exibirPedCliente(cnpjCliente);
        tamanhoPedidos = pedidoController.tamanhoPedidoCliente(cnpjCliente);
        for (cont = 0; cont < tamanhoPedidos; cont++) {
            listaPedidos.addItem(vPedidos[cont]);
        }


    }

    public void excluirClientes(String cliente, String cnpj) throws ParseException {

        if (clienteController.excluirCliente(cliente, cnpj)) {
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
            setContentPane(Tela_Cliente);
            setVisible(false);
            Tela_ListarClientes tela_adm = new Tela_ListarClientes();
        }
    }
}
