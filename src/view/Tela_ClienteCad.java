package view;

import javax.swing.*;

import controller.*;

import java.awt.event.*;
import java.text.ParseException;

public class Tela_ClienteCad extends javax.swing.JFrame {
    private JTextField text_cnpj;
    private JTextField text_email;
    private JTextField text_telefone;
    private JTextField text_inicio_contrato;
    private JTextField text_fim_contrato;
    private JComboBox listaPedidos;
    private JPanel Tela_ClienteCad;
    private JTextField text_razao_social;
    private JButton cadastrarButton;
    private JButton voltarButton;
    private JTextField text_endereco;

    public Tela_ClienteCad() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/view/Ícones/Dados_Cliente_pequeno.png")).getImage());
        setContentPane(Tela_ClienteCad);
        setTitle("Cliente");
        setSize(600, 685);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);


        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                ClienteController clienteController = new ClienteController();
                String[] dadosClienteCad = new String[7];

                dadosClienteCad[0] = text_cnpj.getText();
                dadosClienteCad[1] = text_email.getText();
                dadosClienteCad[2] = text_endereco.getText();
                dadosClienteCad[3] = text_telefone.getText();
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
                        if (clienteController.cadastrarCliente(dadosClienteCad)) {
                            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                            setContentPane(Tela_ClienteCad);
                            setVisible(false);
                            Tela_ListarClientes tela_adm = new Tela_ListarClientes();
                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cadastro do cliente cancelado!");
                setContentPane(Tela_ClienteCad);
                setVisible(false);
                try {
                    Tela_ListarClientes tela_adm = new Tela_ListarClientes();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}


