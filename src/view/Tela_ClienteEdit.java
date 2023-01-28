package view;

import controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_ClienteEdit extends JFrame {
    private JTextField text_cnpj;
    private JTextField text_email;
    private JTextField text_telefone;
    private JTextField text_inicio_contrato;
    private JTextField text_fim_contrato;
    private JPanel Tela_Cliente;
    private JTextField text_razao_social;
    private JButton editarClienteButton;
    private JButton voltarButton;
    private JTextField text_endereco;

    public Tela_ClienteEdit() {
        setContentPane(Tela_Cliente);
        setTitle("Cliente");
        setSize(700, 685);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        ClienteController clienteController = new ClienteController();

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_Cliente);
                setVisible(false);
                try {
                    Tela_ListarClientes tela_listarClientes = new Tela_ListarClientes();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        editarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                ClienteController clienteController = new ClienteController();
                String[] dadosClienteEdit = new String[7];

                dadosClienteEdit[0] = text_cnpj.getText();
                dadosClienteEdit[1] = text_email.getText();
                dadosClienteEdit[2] = text_endereco.getText();
                dadosClienteEdit[3] = text_email.getText();
                dadosClienteEdit[4] = text_razao_social.getText();
                dadosClienteEdit[5] = text_inicio_contrato.getText();
                dadosClienteEdit[6] = text_fim_contrato.getText();

                if ((dadosClienteEdit[0].length() < 6) ||
                        (dadosClienteEdit[1].length() < 6) ||
                        (dadosClienteEdit[2].length() < 10) ||
                        (dadosClienteEdit[3].length() < 10) ||
                        (dadosClienteEdit[4].length() < 3) ||
                        (dadosClienteEdit[5].length() < 9) ||
                        (dadosClienteEdit[6].length() < 9)) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    try {
                        if (clienteController.editarCadastroCliente(dadosClienteEdit)) {
                            JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!!");
                            setContentPane(Tela_Cliente);
                            setVisible(false);
                            Tela_ListarClientes tela_adm = new Tela_ListarClientes();
                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });

    }

    public void exibirClienteEdicao (String cliente) throws ParseException {

        ClienteController clienteController = new ClienteController();

        String[] vCliente = new String[9];
        vCliente = clienteController.exibirCliente(cliente);

        text_cnpj.setText(vCliente[0]);
        text_email.setText(vCliente[1]);
        text_telefone.setText(vCliente[2]);
        text_endereco.setText(vCliente[3]);
        text_razao_social.setText(vCliente[4]);
        text_inicio_contrato.setText(vCliente[5]);
        text_fim_contrato.setText(vCliente[6]);
    }

}
