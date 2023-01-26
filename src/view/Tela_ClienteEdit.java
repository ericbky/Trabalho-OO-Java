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
                Tela_listarCliente tela_cliente = new Tela_listarCliente();
            }
        });

        editarClienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                ClienteController clienteController = new ClienteController();
                String[] dadosClienteCad = new String[7];

                dadosClienteCad[0] = text_cnpj.getText();
                dadosClienteCad[1] = text_email.getText();
                dadosClienteCad[2] = text_endereco.getText();
                dadosClienteCad[3] = text_email.getText();
                dadosClienteCad[4] = text_razao_social.getText();
                dadosClienteCad[5] = text_inicio_contrato.getText();
                dadosClienteCad[6] = text_fim_contrato.getText();

                if ((dadosClienteCad[0].length() < 6) ||
                        (dadosClienteCad[2].length() < 10) ||
                        (dadosClienteCad[3].length() < 10) ||
                        (dadosClienteCad[4].length() < 3) ||
                        (dadosClienteCad[5].length() < 9) ||
                        (dadosClienteCad[6].length() < 9)) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    try {
                        if (clienteController.editarCadastroCliente(dadosClienteCad)) {
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
