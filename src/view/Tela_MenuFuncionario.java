package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_MenuFuncionario extends JFrame {
    private JLabel tituloView;
    private JButton pedidoBTN;
    private JTextField nomeFunc;
    private JPanel Tela_Funcionario;
    private JButton listarFuncBTN;
    private JButton sairButton;

    public Tela_MenuFuncionario() {
        setContentPane(Tela_Funcionario);
        setTitle("Funcionário");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        FuncionarioController funcionarioController = new FuncionarioController();

        listarFuncBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_Funcionario);
                setVisible(false);
                try {
                    Tela_listarFuncFuncionario tela_listarFuncFuncionario = new Tela_listarFuncFuncionario();

                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        pedidoBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_Funcionario);
                setVisible(false);
                try {
                    Tela_listarPedido tela_pedido = new Tela_listarPedido();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_Funcionario);
                setVisible(false);
                Tela_Login tela_login = new Tela_Login();
            }
        });
    }
}

